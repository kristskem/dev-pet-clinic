package lv.dev.pet_clinic.bootstrap;

import lv.dev.pet_clinic.model.Pet;
import lv.dev.pet_clinic.model.PetType;
import lv.dev.pet_clinic.services.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import lv.dev.pet_clinic.model.Owner;
import lv.dev.pet_clinic.model.Vet;
import lv.dev.pet_clinic.services.OwnerService;
import lv.dev.pet_clinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Address1-2");
        owner1.setTelephone("20020010");
        owner1.setCity("Miami");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rasco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setAddress("Address1-2");
        owner2.setTelephone("20020010");
        owner2.setCity("Miami");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(saveCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("Cat");
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded vets...");

        System.out.println("Bootstrap is completed");
    }
}
