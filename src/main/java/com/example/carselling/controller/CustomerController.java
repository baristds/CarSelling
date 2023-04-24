package com.example.carselling.controller;

import com.example.carselling.dto.CarDto;
import com.example.carselling.dto.CustomerDto;
import com.example.carselling.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/customer")
@CrossOrigin
public class CustomerController {

    CustomerService customerService;


    @GetMapping
    public List<CustomerDto> getAll() {
        return customerService.getAll();
    }


}
