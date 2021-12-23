package com.hillel.lesson_04.ex;

/**
 * Напишите программу, которая выводит на экран числа от 1 до 100.
 * При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
 * а вместо чисел, кратных пяти — слово «Buzz». Если число кратно и 3, и 5,
 * то программа должна выводить слово «FizzBuzz»
 */
public class From1to100 {
    public static void print(){
        for (int i = 1; i < 101; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0 ){
                System.out.print("Fizz ");
            } else if(i % 5 == 0){
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
