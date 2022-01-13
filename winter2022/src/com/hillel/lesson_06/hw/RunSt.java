package com.hillel.lesson_06.hw;

public class RunSt {

    public static void main(String[] args) {

        Student[] stArray = new Student[5];

        stArray[0] = new Student(1, "1", "1", 23);
        stArray[1] = new Student(1, "1", "1", 25);
        stArray[2] = new Student(1, "1", "1", 34);
        stArray[3] = new Student(1, "1", "1", 43);
        stArray[4] = new Student(1, "1", "1", 16);

        for (Student student : stArray) {
            if (student.getAge() > 25){
                System.out.println(student);
            }

        }
    }
}
