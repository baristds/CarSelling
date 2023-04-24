package com.example.carselling.mapper;

import com.example.carselling.dto.SellerDto;
import com.example.carselling.models.Seller;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SellerMapper {

    SellerMapper INSTANCE = Mappers.getMapper(SellerMapper.class);

    @Mapping(target = "sellerId", ignore = true)
    SellerDto sellerEntityToDTO(Seller seller);

    @InheritInverseConfiguration
    @Mapping(target = "sellerId", ignore = true)
    Seller sellerDTOToEntity(SellerDto dto);



}
