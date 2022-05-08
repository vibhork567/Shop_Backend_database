package com.example.shopdatabase.controller;

import com.example.shopdatabase.AuthRequest;
import com.example.shopdatabase.JwtService;
import com.example.shopdatabase.entity.User;
import com.example.shopdatabase.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class Childcont {
    @Autowired
    private User user;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtService jwtService;
    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest){
        System.out.println("Inside");
        User user=userRepo.getUserByUsername(authRequest.getUsername());
        if(user!=null && user.getPassword().equals(authRequest.getPassword())){
            System.out.println("valid creds");
            String token= jwtService.createToken(String.valueOf(user.getUserId()));
            return ResponseEntity.ok(token);
        }
        System.out.println("Inside");
        //System.out.println(user.getUsername());
        //System.out.println(user.getPassword());
        ResponseEntity<String> response=new ResponseEntity<String>("Unauthorized", HttpStatus.UNAUTHORIZED);
        return response;
    }
}
