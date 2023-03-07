package com.example.Unexus.services;

import org.springframework.stereotype.Service;

import com.example.Unexus.repositories.UserRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.Unexus.models.UserModels;



@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModels> getUser(){
        return (ArrayList<UserModels>) userRepository.findAll();
    }

    public UserModels saveUser(UserModels user){
        return userRepository.save(user);
    }


    public Optional<UserModels> getById(Long id){
        return userRepository.findById(id);
    }

    

    
}
