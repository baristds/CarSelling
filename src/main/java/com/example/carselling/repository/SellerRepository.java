package com.example.carselling.repository;

import com.example.carselling.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Integer> {


    Optional<Seller> findSellerByLocation(String sellerlocation);
}
