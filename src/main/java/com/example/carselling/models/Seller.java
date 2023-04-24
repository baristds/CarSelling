package com.example.carselling.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private int sellerId;

    @Getter
    @Setter
    private  String location;

    @Getter
    @Setter
    @OneToMany
    private List<Car> cars;

    @Getter
    @Setter
    @ManyToMany
    private List<Customer> customers;

}
