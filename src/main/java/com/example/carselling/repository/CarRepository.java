package com.example.carselling.repository;

import com.example.carselling.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Integer> {

void deleteByPlate(String plateNumber);

Optional<Car> findByPlate(String plateNumber);



}
