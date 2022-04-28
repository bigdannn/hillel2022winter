package com.template.controller;

import com.template.dto.UserDto;
import com.template.dto.UserShortDto;
import com.template.entity.User;
import com.template.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private static final String CALL_ENDPOINT = "call endpoint : %s ";


    private final UserService userService;

    @PostMapping
    public UserDto createUser(@RequestBody UserDto user) {
        log.info(String.format(CALL_ENDPOINT, "create user"));
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id){
        log.info(String.format(CALL_ENDPOINT, "create user"));
        return userService.getUserById(id);
    }

    @GetMapping
    public List<UserShortDto> getAll(){
        List<UserShortDto> collect =
                userService.userList().stream().map(u -> u.setFullName(u.getFullName())).collect(Collectors.toList());
        return collect;
    }
}
