package com.hillel.lesson_05;

public class UserRun {
    public static void main(String[] args) {
        User u1 = new User();

        Object u2 = u1;

        System.out.println(u2.getClass().getName());
        System.out.println(u2.getClass().getSimpleName());
        System.out.println(u2.getClass().getSuperclass().getSimpleName());
    }
}
