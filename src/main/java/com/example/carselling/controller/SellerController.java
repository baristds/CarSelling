package com.example.carselling.controller;

import com.example.carselling.dto.SellerDto;
import com.example.carselling.models.Seller;
import com.example.carselling.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/seller")
@CrossOrigin
public class SellerController {

    SellerService sellerService;

    @GetMapping
    public List<SellerDto> getAll(){

        return sellerService.getAll();
    }

    @GetMapping(value = "/{location}")
    public void findByLocation (@PathVariable("location") String sellerLocation){
        sellerService.findByLocation(sellerLocation);

    }



}
