package com.hillel.lesson_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHM {
    public static void main(String[] args) {
        Map<String, List<Fruit>> shop = new HashMap<>();

        List<Fruit> aFruit = new ArrayList<>();

        aFruit.add(new Fruit("apple", 10));
        aFruit.add(new Fruit("avocado", 5));

        shop.put("A", aFruit);
    }
}


class Fruit{
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
