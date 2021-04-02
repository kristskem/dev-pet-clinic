package lv.dev.pet_clinic.repositories;

import lv.dev.pet_clinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
