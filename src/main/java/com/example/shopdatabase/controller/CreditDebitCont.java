package com.example.shopdatabase.controller;

import com.example.shopdatabase.entity.CreditDebit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.shopdatabase.repository.CreditDebitRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/creditdebit")
public class CreditDebitCont {
    @Autowired
    private CreditDebitRepo credebRepo;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<CreditDebit> getAll()
    {
        return credebRepo.findAll();
    }
    @RequestMapping("/findBycredebId/{credeb_id}")
    public Optional<CreditDebit> getAllCreditDebit(@PathVariable("credeb_id") int credebId)
    {
        return credebRepo.findById(credebId);
    }
    @PostMapping("/creditdebit")
    public CreditDebit saveChildDetails(@RequestBody CreditDebit child) {
        return credebRepo.save(child);
    }
}

