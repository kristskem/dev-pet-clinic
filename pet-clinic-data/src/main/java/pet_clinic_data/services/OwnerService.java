package pet_clinic_data.services;

import pet_clinic_data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
