package com.example.demo.controllers;

import com.example.demo.models.dtos.UserList;
import com.example.demo.models.entities.User;
import com.example.demo.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = {"/api/user"})
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = {"/", "/list"})
    public ResponseEntity<List<UserList>> getAll() {
        return ResponseEntity.ok(this.userService.findAll().stream().map(UserList::from).collect(Collectors.toList()));
    }
}
