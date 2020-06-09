package com.learn.spring.guru.bootstrap;

import com.learn.spring.guru.Map.OwnerServiceMap;
import com.learn.spring.guru.Map.VetServiceMap;
import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Vet;
import com.learn.spring.guru.service.OwnerService;
import com.learn.spring.guru.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService,VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new  Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2=new  Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);
        System.out.println("Loaded Owners");
        Vet vet1=new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);
        System.out.println("Loaded Vets");

        System.out.println(vetService.findAll().toString());
    }
}
