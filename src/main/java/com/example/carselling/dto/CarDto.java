package com.example.carselling.dto;

import com.example.carselling.models.Seller;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

public class CarDto {

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
