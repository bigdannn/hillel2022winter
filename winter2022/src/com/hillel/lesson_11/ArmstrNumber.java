package com.hillel.lesson_11;

// Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
// Прежде всего, нам нужно понять, что такое число Армстронга.
// Число Армстронга это число, значение которого равно сумме цифр,
// из которых оно состоит, возведенных в степень, равную количеству
// цифр в этом числе. Как пример - число 371:
//    371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
//
// Если у вас число четырехзначное:
//
//    8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 820812.
//    Напишите Java-программу для удаления всех пробелов из строки без использования
//    replace().
public class ArmstrNumber {

    public static void main(String[] args) {
        int count = 100;
        int value = 0;
        while (count != 0 ){
            if (isArmstrongNumber(value)){
                System.out.println(value++);
                count--;
            } else {
                value++;
            }

        }
    }


    private static boolean isArmstrongNumber(Integer value){
        String[] mass = value.toString().split("");
        int pow = mass.length;
        int count = 0;
        for (String s : mass){
            Integer v = Integer.parseInt(s);
            count +=Math.pow(v, pow);
        }
        return value == count;
    }
}
