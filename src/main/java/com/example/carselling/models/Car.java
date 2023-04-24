package com.example.carselling.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private int milega;

    @Getter
    @Setter
    private String price;

    @Getter
    @Setter
    private String plate;

    @Getter
    @Setter
    private String transmissonType;

    @Getter
    @Setter
    private String brand;

    @Getter
    @Setter
    private String brand_model;

    @Getter
    @Setter
    @ManyToOne
    private Seller seller;



}
