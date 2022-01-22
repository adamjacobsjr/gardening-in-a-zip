package org.wecancodeit.gardeninginazip.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.gardeninginazip.models.Type;
import org.wecancodeit.gardeninginazip.storage.repos.TypeRepository;

@Service
public class TypeStorage {
    TypeRepository typeRepo;

    public TypeStorage(TypeRepository typeRepo){
        this.typeRepo=typeRepo;
    }

    public void save(Type typeToSave){
        typeRepo.save(typeToSave);
    }

    public Iterable<Type> retrieveAllTypes(){
        return typeRepo.findAll();
    }
}
