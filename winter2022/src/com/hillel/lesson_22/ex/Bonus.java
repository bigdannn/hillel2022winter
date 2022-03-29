package com.hillel.lesson_22.ex;

import java.util.Arrays;

public class Bonus {
    public static void main(String[] args) {
        String[] str = new String[10]; // null default values
        str[0] = "FIRST";
        System.out.println(Arrays.asList(str).size()); // 10
        System.out.println(Arrays.asList(str)); // 10 null null ...
    }
}
