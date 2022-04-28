package com.template.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}
