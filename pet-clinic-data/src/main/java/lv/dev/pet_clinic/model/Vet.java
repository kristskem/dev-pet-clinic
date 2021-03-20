package lv.dev.pet_clinic.model;

import java.util.Set;

public class Vet extends Person{

    public Set<Specialty> getSpecialtySet() {
        return specialtySet;
    }

    public void setSpecialtySet(Set<Specialty> specialtySet) {
        this.specialtySet = specialtySet;
    }

    private Set<Specialty> specialtySet;
}
