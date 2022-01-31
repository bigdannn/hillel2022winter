package com.hillel.lesson_11.lombok.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"id","email"})
public class Student {
    private int id;
    @Getter
    @Setter
    private String name;
    @Setter
    private String phone;
    private String email;


}
