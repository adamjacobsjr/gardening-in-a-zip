package org.wecancodeit.gardeninginazip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Type {

        @Id
        @GeneratedValue
        private Long id;
        private String speciesName;
        private String genusName;
        @ManyToMany(mappedBy = "hardiness")
        private Collection<Plant> plants;

        public Long getId() {
            return id;
        }

        public Collection<Plant> getPlants(){
            return plants;
        }

        public String getSpeciesName() {
            return speciesName;
        }

        public String getGenusName() {
            return genusName;
        }

        public Type(){

        }

        public Type(String speciesName, String genusName) {
            this.speciesName = speciesName;
            this.genusName = genusName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Type type = (Type) o;
            return Objects.equals(id, type.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }






