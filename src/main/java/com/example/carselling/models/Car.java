package com.example.carselling.models;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    private int milega;


    private String price;


    private String plate;


    private String transmissonType;


    private String brand;


    private String brand_model;


  @ManyToOne
  private Seller seller;



}
