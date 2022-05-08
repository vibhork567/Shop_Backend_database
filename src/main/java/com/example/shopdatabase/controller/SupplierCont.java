package com.example.shopdatabase.controller;

import com.example.shopdatabase.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.shopdatabase.repository.SupplierRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/supplier")
public class SupplierCont {
    @Autowired
    private SupplierRepo supplierRepo;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Supplier> getAll() {
        List<Supplier> list = supplierRepo.findAll();
//        for(Admission a:list)
//        {
//            System.out.println(a);
//        }
        return list;
    }

    @RequestMapping("/findBysuppId/{supp_id}")
    public Optional<Supplier> getAllCreditDebit(@PathVariable("supp_id") int suppId) {
        return supplierRepo.findById(suppId);
    }

    @PostMapping("/add")
    public Supplier saveChildDetails(@RequestBody Supplier child) {
        return supplierRepo.save(child);
    }
}
