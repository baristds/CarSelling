package com.example.carselling.dto;

import com.example.carselling.models.Seller;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class CustomerDto {

    @Getter
    @Setter
    private int s_securityNumber;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String phoneNumber;

    @Getter
    @Setter
    private String adress;

    @Getter
    @Setter
    @ManyToMany
    private List<Seller> sellers;


}
