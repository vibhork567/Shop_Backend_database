package com.example.shopdatabase.repository;

import com.example.shopdatabase.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepo extends JpaRepository<Billing,Integer> {
}
