package com.hillel.lesson_29;

public class Test1 {
    static boolean foo (String c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo("init"); foo("chech") && (i < 3); foo("incr")) {
            System.out.println(i);
            i++;
            foo("do");
        }
    }
}
