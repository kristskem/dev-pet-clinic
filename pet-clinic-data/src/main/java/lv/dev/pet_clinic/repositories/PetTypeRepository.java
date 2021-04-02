package lv.dev.pet_clinic.repositories;

import lv.dev.pet_clinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
