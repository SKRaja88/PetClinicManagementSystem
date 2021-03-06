package com.learn.spring.guru.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name="owners")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Owner extends Person{

   @Column(name="address")
   private String address;

   @Column(name="city")
   private String city;

   @Column(name="telephone")
   private String telephone;

   @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
   private Set<Pet> pets=new HashSet();

   @Builder
   public Owner(Long Id,String firstName,String lastName,String address,String city,String telephone,Set<Pet> pets){
      super(Id,firstName,lastName);
      this.address=address;
      this.city=city;
      this.telephone=telephone;
      this.pets=pets;
   }

}
