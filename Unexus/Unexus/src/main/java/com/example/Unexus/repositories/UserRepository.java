package com.example.Unexus.repositories;

import com.example.Unexus.models.UserModels;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModels, Long> {

    public abstract ArrayList<UserModels> findByName(String name);
    

    
}
