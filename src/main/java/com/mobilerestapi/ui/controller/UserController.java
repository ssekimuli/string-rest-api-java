package com.mobilerestapi.ui.controller;

import com.mobilerestapi.ui.model.request.UserDetailsRequestModel;
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
    @PostMapping("/create")
    public String createUser(@RequestBody UserDetailsRequestModel userDetails) {
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
