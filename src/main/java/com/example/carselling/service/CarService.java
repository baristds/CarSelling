package com.example.carselling.service;

import com.example.carselling.dto.CarDto;
import com.example.carselling.mapper.CarMapper;
import com.example.carselling.models.Car;
import com.example.carselling.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService {


    CarMapper carMapper;
    CarRepository carRepository;


    public List<CarDto> getAll() {

        List<Car> list = carRepository.findAll();
        return list.stream().map(carMapper::carEntityToDTO).collect(Collectors.toList());
    }


    public List<CarDto> findByBrand(String brandName) {
        List<Car> list = carRepository.findAll();
        return list.stream().filter(car -> car.getBrand().equals(brandName)).map(carMapper::carEntityToDTO).collect(Collectors.toList());
    }


    public void deleteCar(String plateNumber) {
        carRepository.deleteByPlate(plateNumber);

    }

    public void updatePrice(String plateNumber, String newPrice) {

        Optional<Car> findedCar = carRepository.findByPlate(plateNumber);
        if (findedCar.isPresent()){
            Car car = findedCar.get();
            car.setPrice(newPrice);
            carRepository.save(car);
            CarDto carDto= carMapper.carEntityToDTO(car);
        }


    }



}
