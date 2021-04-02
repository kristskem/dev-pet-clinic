package lv.dev.pet_clinic.repositories;

import lv.dev.pet_clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
