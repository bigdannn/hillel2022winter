package com.template.service.impl;

import com.template.dto.UserDto;
import com.template.dto.UserShortDto;
import com.template.entity.User;
import com.template.exceptions.NoUniqueDataException;
import com.template.mapper.MapperConfig;
import com.template.repository.UserRepository;
import com.template.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperConfig mapperConfig;

    @Override
    public UserDto createUser(UserDto user) {
        isUserExist(user.getPhone());
        User u = mapperConfig.map(user, User.class);
        u =  userRepository.save(u);
        return mapperConfig.map(u, UserDto.class) ;
    }

    @Override
    public UserDto getUserById(Long id) {
        return mapperConfig.map(userRepository.getOne(id), UserDto.class);
    }

    @Override
    public List<UserShortDto> userList() {
        return userRepository.findAll()
                .stream()
                .map(u -> mapperConfig.map(u, UserShortDto.class))
                .collect(Collectors.toList());
    }

    private void isUserExist(String phone){
        if (userRepository.findByPhone(phone).isPresent())
            throw new   NoUniqueDataException("user already register in system");
    }
}
