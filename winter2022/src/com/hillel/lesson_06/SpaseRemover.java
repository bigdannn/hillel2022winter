package com.hillel.lesson_06;

public class SpaseRemover {
    //Напишите Java-программу для удаления всех пробелов из строки без использования
    //replace().

    public static void main(String[] args) {
        String str = "aaa ss  f  gg  hjj  kk  ll yy  yttt  yyy ";
        String[] arrStr = str.split(" ");

        String s1 = "";
        for (String s : arrStr) {
            if (s.isBlank()) continue;
            s1 = s1.concat(s);
        }

        String s2 = "";
        for (String s : arrStr) {
            s2 = s2 + s;
        }

        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);
        System.out.println(s2.length());
    }
}
