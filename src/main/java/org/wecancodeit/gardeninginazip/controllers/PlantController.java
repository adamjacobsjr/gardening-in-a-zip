package org.wecancodeit.gardeninginazip.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.gardeninginazip.models.Hardiness;
import org.wecancodeit.gardeninginazip.models.Plant;
import org.wecancodeit.gardeninginazip.models.Type;
import org.wecancodeit.gardeninginazip.storage.HardinessStorage;
import org.wecancodeit.gardeninginazip.storage.PlantStorage;
import org.wecancodeit.gardeninginazip.storage.TypeStorage;

import java.util.Collection;

@RestController
public class PlantController {
    PlantStorage plantStorage;
    TypeStorage typeStorage;
    HardinessStorage hardStorage;

    public PlantController(PlantStorage plantStorage,TypeStorage typeStorage,HardinessStorage hardStorage) {
        this.plantStorage = plantStorage;
        this.typeStorage = typeStorage;
        this.hardStorage = hardStorage;
    }

    @GetMapping("/Home")
    public Iterable<Plant> retrieveAllPlants(){
        return plantStorage.retrieveAllPlants();
    }

    @GetMapping("/Type")
    public Iterable<Type> retrieveAllTypes(){
        return typeStorage.retrieveAllTypes();
    }

    @GetMapping("/Hardiness")
    public Iterable<Hardiness> retrieveAllHard(){
        return hardStorage.retrieveAllTypes();
    }

    @GetMapping("/Fruits")
    public Collection<Plant> retrieveAllFruits(){
        return plantStorage.retrieveAllFruits();
    }

    @GetMapping("/plant/{id}")
    public Plant retrievePlantById(@PathVariable Long id){
        return plantStorage.retrieveById(id);
    }

}
