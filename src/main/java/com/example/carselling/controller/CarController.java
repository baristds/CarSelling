package com.example.carselling.controller;

import com.example.carselling.dto.CarDto;
import com.example.carselling.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cars")
@CrossOrigin
public class CarController {

    CarService carService;

    @GetMapping
    public List<CarDto> getAll() {
        return carService.getAll();
    }

    @GetMapping(value = "/{brand}")
    public List<CarDto> findByBrand(String brandName){
        return carService.findByBrand(brandName);
    }

    @DeleteMapping(value = "/{plate}")
    public void deleteCarbyPlate(@PathVariable("plate") String plateNumber) {
       carService.deleteCar(plateNumber);
    }

    @PutMapping(value = "/{plate}")
    public void updatePrice(@PathVariable("plate")String plateNumber, String newPrice){
        carService.updatePrice(plateNumber, newPrice);
    }




}
