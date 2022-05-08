package com.example.shopdatabase.controller;

import com.example.shopdatabase.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.shopdatabase.repository.CustomerRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerCont {
    @Autowired
    private CustomerRepo custRepo;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Customer> getAll()
    {
        return custRepo.findAll();
    }
    @RequestMapping("/findByCustomer/{cust_id}")
    public Optional<Customer> getAllCustomer(@PathVariable("cust_id") int custId)
    {
        return custRepo.findById(custId);
    }
    @PostMapping("/customeradd")
    public Customer saveChildDetails(@RequestBody Customer child) {
        return custRepo.save(child);
    }
}

