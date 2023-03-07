package com.example.Unexus.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.Unexus.models.UserModels;
import com.example.Unexus.services.UserServices;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserServices userServices;

    @GetMapping
    public ArrayList<UserModels> getUser(){

        return userServices.getUser();
    }

    @PostMapping
    public UserModels saveUser(@RequestBody UserModels user){
        return this.userServices.saveUser(user);

    }

    
}
