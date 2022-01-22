package org.wecancodeit.gardeninginazip.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.gardeninginazip.models.Hardiness;
import org.wecancodeit.gardeninginazip.models.Type;
import org.wecancodeit.gardeninginazip.storage.repos.HardinessRepository;

@Service
public class HardinessStorage {
    HardinessRepository hardRepo;

    public HardinessStorage(HardinessRepository hardRepo){
        this.hardRepo=hardRepo;
    }

    public void save(Hardiness hardToSave){
        hardRepo.save(hardToSave);
    }

    public Iterable<Hardiness> retrieveAllTypes(){
        return hardRepo.findAll();
    }
}
