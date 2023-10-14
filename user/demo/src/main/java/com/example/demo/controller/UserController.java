package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUser(){
        List<User> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }
    @GetMapping("")
    public ResponseEntity<?> createUser(){
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> deleteeUser(){
        return null;
    }


}
