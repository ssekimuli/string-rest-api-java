package com.mobilerestapi.service.impl;

import com.mobilerestapi.service.UserService;
import com.mobilerestapi.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }

    @Override
    public UserDto updateUser(String userId, UserDto userDto) {
        return null;
    }
}
