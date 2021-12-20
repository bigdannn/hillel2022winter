package com.hillel.lesson_03.ex;

import java.util.Scanner;

public class ChetNumber {

    public static void main(String[] args) {

        String value;
        if (args.length == 0 ){
            value = new Scanner(System.in).next();
        } else {
            value = args[0];
        }
        char[] ch = value.toCharArray();

        int count = 0;

        for (char  c : ch) {
            int a = Integer.parseInt(String.valueOf(c));
            if (a % 2 == 0) count +=a;
        }

        System.out.println(count);
    }

}
