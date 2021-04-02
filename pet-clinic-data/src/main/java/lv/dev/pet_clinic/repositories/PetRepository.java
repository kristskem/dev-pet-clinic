package lv.dev.pet_clinic.repositories;

import lv.dev.pet_clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
