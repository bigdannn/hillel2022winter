package com.hillel.lesson_04.ex;

public class HappyNumbers {

    public static boolean calculateLuckyNumber(String value){

        String[] str = value.split("");
        if (str.length % 2 == 1) return false;
        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length /2; i++){
            left  += Integer.parseInt(str[i]);
            right += Integer.parseInt(str[str.length - i - 1]);
        }
        return left == right;
    }
}
