package com.example.carselling.service;

import com.example.carselling.dto.SellerDto;
import com.example.carselling.mapper.SellerMapper;
import com.example.carselling.models.Car;
import com.example.carselling.models.Seller;
import com.example.carselling.repository.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SellerService {

    SellerRepository sellerRepository;
    SellerMapper sellerMapper;


    public List<SellerDto> getAll() {
        List<Seller> list = sellerRepository.findAll();
        return list.stream().map(sellerMapper::sellerEntityToDTO).collect(Collectors.toList());
    }


    public void findByLocation(String sellerLocation) {
        Optional<Seller> optionalSeller =sellerRepository.findSellerByLocation(sellerLocation);
        Seller seller = optionalSeller.get();
        SellerDto sellerDto = sellerMapper.sellerEntityToDTO(seller);
    }
}
