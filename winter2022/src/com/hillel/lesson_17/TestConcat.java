package com.hillel.lesson_17;

public class TestConcat {
    public static void main(String[] args) {

        // acd -> a c d ->
        String value = String.valueOf(Numbers.a) + String.valueOf(Numbers.c) + String.valueOf(Numbers.d);
        System.out.println(value);


        //  ♥♥♥♥
        // ♥   ♥♥
        //   ♥♥♥
        // ♥   ♥♥
        //  ♥♥♥♥

        //http://vkontakte.doguran.ru/kak-pisat-simvolami.php
    }

}


class Numbers {

    static int a = 1;
    static int b = 2;
    static int c = 3;
    static int d = 4;
}