package com.hillel.lesson_11.hw;

public class Main {

    public static void main(String[] args) {
        ObjectCollectionImpl collection = new ObjectCollectionImpl(0);
//        ObjectCollectionImpl collection = new ObjectCollectionImpl(10);
        Person person1 = new Person("Alex", "James", 40);
        Person person3 = new Person("Alex", "James", 40);
        Person person2 = new Person("Mariya", "Alfred", 35);
        collection.add(person1);
        collection.add(person2);
        collection.add(person3);
        collection.show();
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(collection.size());
    }

}
