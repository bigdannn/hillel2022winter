package com.hillel.lesson_19.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
//        Boolean [] arr = new Boolean[2]; // default value null
        boolean [] arr = new boolean[2]; // default value null
//        System.out.println(Arrays.deepToString(arr));
        List<Boolean> list = new ArrayList<>();
        System.out.println(list.add(arr[0]));
        System.out.println(list.add(arr[1]));
        System.out.println(list);
        if (list.remove( 1 )) {
            list.remove( 0 );
        }
        System. out .println(list);
    }
}

