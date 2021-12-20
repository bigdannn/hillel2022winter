package com.hillel.lesson_03.ex;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String value;
        if (args.length == 0 ){
            value = new Scanner(System.in).next();
        } else {
            value = args[0];
        }
        Integer.parseInt(value);
        System.out.println(value);
        String[] str = value.split("");
        value = "";
        for (int i = str.length-1; i >= 0; i--){
            value = value.concat(str[i]);
        }

        System.out.println(value);
    }
}
