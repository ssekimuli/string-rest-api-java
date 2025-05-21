package com.mobilerestapi.service;

import com.mobilerestapi.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto updateUser(String userId, UserDto user);
}
