package com.example.shopdatabase.repository;

import com.example.shopdatabase.entity.CreditDebit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditDebitRepo extends JpaRepository<CreditDebit,Integer> {
}
