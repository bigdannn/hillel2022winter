package com.hillel.lesson_09.tasks;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {

    List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "zaz", "123", 6, 9000, 90));
        cars.add(new Car(2, "vaz", "234", 4, 12000, 110));
        cars.add(new Car(3, "ford", "345", 2, 15000, 130));
        cars.add(new Car(4, "tesla", "456", 9, 45000, 180));
        cars.add(new Car(5, "pagani", "567", 1, 99999, 220));
        return cars;
    }
}
