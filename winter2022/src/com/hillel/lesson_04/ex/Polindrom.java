package com.hillel.lesson_04.ex;

public class Polindrom {

    public static boolean calculate(String str){
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }

    public static boolean calculateCorrect(String str){
        String[] s = str.replaceAll(" ", "").split("");
        for (int i = 0; i < s.length / 2; i++){
            System.out.println(i);
            if (!s[i].equals(s[s.length - 1 - i])) return false;
        }
        return true;
    }


}
