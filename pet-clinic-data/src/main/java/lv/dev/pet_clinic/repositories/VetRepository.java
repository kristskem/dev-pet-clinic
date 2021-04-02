package lv.dev.pet_clinic.repositories;

import lv.dev.pet_clinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
