package com.template.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserShortDto {
    private long id;
    private String firstName;
    private String lastName;
    private String fullName;

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
