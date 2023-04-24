package com.example.carselling.mapper;

import com.example.carselling.dto.CustomerDto;
import com.example.carselling.models.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "s_securityNumber", ignore = true)
    CustomerDto customerEntityToDTO(Customer customer);

    @InheritInverseConfiguration
    @Mapping(target = "s_securityNumber", ignore = true)
    Customer customerDTOToEntity(CustomerDto dto);


}
