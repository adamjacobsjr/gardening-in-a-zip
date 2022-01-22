package org.wecancodeit.gardeninginazip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;


@Entity
public class Plant {

    @Id
    @GeneratedValue
    private Long id;
    String name;
    @Lob
    private String description;
    private String url;
//    @ManyToMany(mappedBy = "plants")
    @ManyToMany
    private Collection<Hardiness> hardiness;
    @ManyToOne
//    @JsonIgnore
    private Type type;
    @ManyToMany
    @JsonIgnore
    private Set<HashTag> hashTags;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String getUrl(){
        return url;
    }

    public Collection<Hardiness> getHardiness() {
        return hardiness;
    }

    public Type getType() {
        return type;
    }


    public Collection<HashTag> getHashTags(){
        return hashTags;
    }


    public Plant(){

    }

    public Plant(String name, String description, Type type,String url,Hardiness ...hardiness) {
        this.name=name;
        this.description=description;
        this.type=type;
        this.url=url;
        this.hardiness=new ArrayList<>(Arrays.asList(hardiness));
//        this.hashTags = new HashSet<>();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(id, plant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void addHashTag(HashTag hashTagToAdd) {
        hashTags.add(hashTagToAdd);
    }

    public void deleteHashTag(HashTag hashTagToRemove) {
        hashTags.remove(hashTagToRemove);
    }


}
