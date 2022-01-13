package com.hillel.lesson_06.task;

public class Number {
    // 7. Найти число, состоящее только из различных цифр.
    // Если таких чисел несколько, найти первое из них.

    public static void main(String[] args) {
        String number = "2135";

        String[] arr = number.split("");

        for (int i = 0; i < arr.length-1; i++){
            if (Integer.parseInt(arr[i + 1]) > Integer.parseInt(arr[i])) {continue;}
            else {
                System.out.println("Error");break;}

        }


    }
}
