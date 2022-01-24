package com.hillel.lesson_09.tasks.impl;

import com.hillel.lesson_09.tasks.Car;
import com.hillel.lesson_09.tasks.TaxiService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiServiceImpl implements TaxiService {

    @Override
    public int getCarTotalPrice(List<Car> cars) {
        int totalPrice = 0;
        for (Car c : cars) totalPrice += c.getPrice();
        return totalPrice;
    }

    @Override
    public void sortByConsumption(List<Car> cars) {
        cars.sort(Comparator.comparing(Car::getFuelConsumption));
    }

    @Override
    public List<Car> getCarsBySpeedParameters(List<Car> cars, int minSpeed, int maxSpeed) {
        List<Car> list = new ArrayList<>();
        for (Car c : cars) {
            if (c.getMaxSpeed() > minSpeed && c.getMaxSpeed() < maxSpeed)
                list.add(c);
        }
        return list;
    }
}
