package com.example.shopdatabase.controller;

import com.example.shopdatabase.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.shopdatabase.repository.ProductRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductCont {
    @Autowired
    private ProductRepo prodRepo;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Product> getAll()
    {
        return prodRepo.findAll();
    }
    @RequestMapping("/findByBillId/{bill_id}")
    public Optional<Product> getAllDischargeSummaries(@PathVariable("bill_id") int billId)
    {
        return prodRepo.findById(billId);
    }
    @PostMapping("/add")
    public Product saveChildDetails(@RequestBody Product child) {
        return prodRepo.save(child);
    }
}

