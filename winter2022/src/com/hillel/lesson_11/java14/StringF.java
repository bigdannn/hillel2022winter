package com.hillel.lesson_11.java14;

public class StringF {

    private static final String SQL = "select * form table where id = %s and name = %s";

    public static void main(String[] args) {
        System.out.println(String.format(SQL, "100", "Ivan"));
    }
}
