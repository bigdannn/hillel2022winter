package com.hillel.lesson_08.set;

import java.util.HashSet;
import java.util.Set;

public class HSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set.add("1"));
        System.out.println(set.add("1")); // false
        System.out.println(set.add("2"));
        System.out.println(set.add("3"));

        System.out.println(set);

        int i = 1;
        int count = 0;
        String value = null;
        for (String s : set){
            if (count++ == i) value = s;
         }

        System.out.println(value);

    }
}
