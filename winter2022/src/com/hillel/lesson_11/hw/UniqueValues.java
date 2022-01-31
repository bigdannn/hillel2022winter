package com.hillel.lesson_11.hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueValues {
    public static void main(String[] args) {

        List lst = List.of("1","1","1","2","1","3","3");
        List lst1 = List.of(1,1,1,2,3,5,2,5,5);

        System.out.println(uniqueCollection(lst1));
    }

    private static ArrayList uniqueCollection(List list){
        return new ArrayList(new HashSet(list));
    }
}
