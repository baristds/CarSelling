package com.example.carselling.service;

import com.example.carselling.dto.CarDto;
import com.example.carselling.dto.CustomerDto;
import com.example.carselling.mapper.CustomerMapper;
import com.example.carselling.models.Car;
import com.example.carselling.models.Customer;
import com.example.carselling.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {

    CustomerRepository customerRepository;
    CustomerMapper customerMapper;

    public List<CustomerDto> getAll() {
        List<Customer> list = customerRepository.findAll();
        return list.stream().map(customerMapper::customerEntityToDTO).collect(Collectors.toList());
    }
}
