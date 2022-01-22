package org.wecancodeit.gardeninginazip.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Hardiness {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    @OneToMany(mappedBy = "hardiness")
    @JsonIgnore
    private Collection<Plant> plants;

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Collection<Plant> getPlants() {
        return plants;
    }
    //default no args constructor required for jpa
    public Hardiness(){

    }

    public Hardiness(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hardiness hardiness = (Hardiness) o;
        return Objects.equals(id, hardiness.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



