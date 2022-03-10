package com.hillel.lesson_17.io.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CharStream {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/Users/stepurkoolksandr/hillel2022winter/winter2022/src/com/hillel/lesson_17/io/charStream/input.txt");
             FileWriter fw = new FileWriter("/Users/stepurkoolksandr/hillel2022winter/winter2022/src/com/hillel/lesson_17/io/charStream/output.txt")) {
            List<Character> list = new ArrayList<>();
            int a;
            while ((a = fr.read()) != -1) {
                list.add((char) a);
                fw.write(a);
            }
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
