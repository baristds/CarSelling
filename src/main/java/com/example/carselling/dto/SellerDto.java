package com.example.carselling.dto;

import com.example.carselling.models.Car;
import com.example.carselling.models.Customer;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class SellerDto {

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
