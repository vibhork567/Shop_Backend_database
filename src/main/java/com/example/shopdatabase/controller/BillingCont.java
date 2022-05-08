package com.example.shopdatabase.controller;

import com.example.shopdatabase.entity.Billing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.shopdatabase.repository.BillingRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/billing")
public class BillingCont {
    @Autowired
    private BillingRepo billRepo;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Billing> getAll()
    {
        return billRepo.findAll();
    }
    @RequestMapping("/findByBillId/{bill_id}")
    public Optional<Billing> getAllDischargeSummaries(@PathVariable("bill_id") int billId)
    {
        return billRepo.findById(billId);
    }
    @PostMapping("/children")
    public Billing saveChildDetails(@RequestBody Billing child) {
        return billRepo.save(child);
    }
}
