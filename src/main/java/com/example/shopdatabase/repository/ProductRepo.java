package com.example.shopdatabase.repository;

import com.example.shopdatabase.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
