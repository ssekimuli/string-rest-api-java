package com.mobilerestapi.ui.controller;

import com.mobilerestapi.shared.dto.UserDto;
import com.mobilerestapi.ui.model.request.UserDetailsRequestModel;
import com.mobilerestapi.ui.model.request.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mobilerestapi.service.UserService;

@RestController
@RequestMapping("/api") //http://localhost:8080/api
public class UserController {

    @Autowired
    UserService UserService;
    @GetMapping()
    public String getUser() {
        return "getUser";
    }
    @PostMapping("/create")
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        UserDto UserDto = new UserDto();
        BeanUtils.copyProperties(userDetails, UserDto);
        UserDto createdUser = UserService.createUser(UserDto);
        BeanUtils.copyProperties(createdUser, returnValue);
        return returnValue;
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
