package org.wecancodeit.gardeninginazip.storage.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.gardeninginazip.models.Plant;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
