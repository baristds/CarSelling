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
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private int s_securityNumber;


    private String name;


    private String phoneNumber;


    private String adress;


    @ManyToMany(mappedBy = "customers",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Seller> sellers =new ArrayList<>();


}
