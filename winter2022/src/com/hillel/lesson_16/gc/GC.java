package com.hillel.lesson_16.gc;

import java.util.Objects;

public class GC {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== START ===");
        Person person = new Person("User 1");
        Person person1 = new Person("User 2");

        person = null;

        System.gc();

        System.out.println(Objects.nonNull(person));
        System.out.println(Objects.nonNull(person1));

        Thread.sleep(15000);
        System.out.println("=== FINISH ==");
    }
}
