package com.hillel.lesson_10.charCount;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class RunCount {
    public static void main(String[] args) {
        String text = Text.getText();
        String[] split = text
                .toLowerCase()
                .replaceAll(" ",  "")
                .split("");

        HashMap<String, Integer> vocabulary = new HashMap<>();

        for (String s : split){
            if (!vocabulary.containsKey(s))
                vocabulary.put(s, 1);
            else {
                int count = vocabulary.get(s);
                vocabulary.put(s, ++count);
            }
        }

        Set<Map.Entry<String, Integer>> entries = vocabulary.entrySet();

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;

        String minValue = "";
        String maxValue = "";

        for (Map.Entry<String, Integer> e : entries){
            Double per = (double) e.getValue() / split.length * 100;
            System.out.println(e.getKey() + " " + e.getValue() + " " + per + " %");

            if (min > e.getValue())
            {
                min = e.getValue();
                minValue = e.getKey();
            }

            if (max < e.getValue()) {
                max = e.getValue();
                maxValue = e.getKey();
            }
        }

        System.out.println("---------");
        System.out.println("max = " + max);
        System.out.println("max % = " + ((max / split.length) * 100));
        System.out.println("maxValue = " + maxValue);
        System.out.println("min % = " + (min / split.length) * 100);
        System.out.println("min = " + min);
        System.out.println("minValue = " + minValue);



    }
}
