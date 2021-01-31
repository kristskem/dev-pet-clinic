package pet_clinic_data.services;

import pet_clinic_data.model.Owner;
import pet_clinic_data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

