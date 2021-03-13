package lv.dev.pet_clinic.services;

import lv.dev.pet_clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
