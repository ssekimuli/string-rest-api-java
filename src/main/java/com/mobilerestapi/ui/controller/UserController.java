package com.mobilerestapi.ui.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //http://localhost:8080/api
public class UserController {

    @GetMapping()
    public String getUser() {
        return "getUser";
    }
    @PostMapping
    public String createUser() {
        return "createUser";
    }
    @PutMapping
    public String updateUser() {
        return "updateUser";
    }
    @DeleteMapping
    public String deleteUser() {
        return "deleteUser";
    }
}
