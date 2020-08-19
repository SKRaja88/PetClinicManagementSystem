package com.learn.spring.guru.bootstrap;

import com.learn.spring.guru.model.*;
import com.learn.spring.guru.service.SDJpaServices.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader<VetDJpaService, PetTypeDJpaService, SpecialityDJpaService, VisitDJpaService, SpecialtySDJpaService, VisitSDJpaService> implements CommandLineRunner {

    private final OwnerSDJpaService ownerSDJpaService;
    private final VetSDJpaService vetSDJpaService;
    private final PetTypeSDJpaService petTypeSDJpaService;
    private final SpecialitySDJpaService specialitySDJpaService;
   private final com.learn.spring.guru.service.SDJpaServices.VisitSDJpaService visitSDJpaService;

    public DataLoader(OwnerSDJpaService ownerSDJpaService, VetSDJpaService vetSDJpaService, PetTypeSDJpaService petTypeSDJpaService, SpecialitySDJpaService specialitySDJpaService, com.learn.spring.guru.service.SDJpaServices.VisitSDJpaService visitSDJpaService) {
        this.ownerSDJpaService = ownerSDJpaService;
        this.vetSDJpaService = vetSDJpaService;
        this.petTypeSDJpaService = petTypeSDJpaService;
        this.specialitySDJpaService = specialitySDJpaService;
        this.visitSDJpaService = visitSDJpaService;

    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeSDJpaService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeSDJpaService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialitySDJpaService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialitySDJpaService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = specialitySDJpaService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerSDJpaService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerSDJpaService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(fionasCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitSDJpaService.save(catVisit);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetSDJpaService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        vetSDJpaService.save(vet2);

        System.out.println("Loaded Vets....");


    }
}
