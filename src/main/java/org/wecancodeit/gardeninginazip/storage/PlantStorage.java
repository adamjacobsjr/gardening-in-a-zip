package org.wecancodeit.gardeninginazip.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.gardeninginazip.models.Plant;
import org.wecancodeit.gardeninginazip.storage.repos.PlantRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class PlantStorage {
    PlantRepository plantRepo;

    public PlantStorage(PlantRepository plantRepo){
        this.plantRepo=plantRepo;
    }

    public void save(Plant plantToAdd){
        plantRepo.save(plantToAdd);
    }

    public Iterable<Plant> retrieveAllPlants(){
        return plantRepo.findAll();
    }

    public Plant retrieveById(Long id){
        return plantRepo.findById(id).get();
    }

    public Collection<Plant> retrieveAllFruits(){
        Iterable<Plant> allPlants = plantRepo.findAll();
        Collection<Plant> allFruits = new ArrayList<>();

        for(Plant x:allPlants){
            if(x.getType().getSpeciesName().equals("Fruit")){
                allFruits.add(x);
            }
        }
        return allFruits;
    }
}
