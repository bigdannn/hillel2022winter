package com.template.service;

import com.template.dto.UserDto;
import com.template.dto.UserShortDto;
import com.template.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long id);

    List<UserShortDto> userList();


}
