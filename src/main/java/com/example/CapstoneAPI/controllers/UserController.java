package com.example.CapstoneAPI.controllers;

import com.example.CapstoneAPI.domain.Users;
import com.example.CapstoneAPI.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final
    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public Iterable<Users> getUser() {
        return userRepository.findAll();
    }

}
