package com.example.shopdatabase.repository;

import com.example.shopdatabase.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
