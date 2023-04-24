package com.example.carselling.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



     private  String location;


     @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
     private List<Car> cars =new ArrayList<>();



     @ManyToMany
     private List<Customer> customers = new ArrayList<>();

}
