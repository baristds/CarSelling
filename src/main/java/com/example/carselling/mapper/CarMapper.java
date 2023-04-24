package com.example.carselling.mapper;

import com.example.carselling.dto.CarDto;
import com.example.carselling.models.Car;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface   CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "plate", ignore = true)
    CarDto carEntityToDTO(Car car);

    @InheritInverseConfiguration
    @Mapping(target = "plate", ignore = true)
    Car carDTOToEntity(CarDto dto);


}
