package com.example.shopdatabase.repository;

import com.example.shopdatabase.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier,Integer>{
}
