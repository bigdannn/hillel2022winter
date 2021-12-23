package com.hillel.lesson_04.ex;

import java.util.Scanner;

public class DataInput {

    public static String getData(String str){
        System.out.println(str);
        return new Scanner(System.in).nextLine();
    }

}
