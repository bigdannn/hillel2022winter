package com.hillel.lesson_09.tasks;

import java.util.List;

public interface TaxiService {

    int getCarTotalPrice(List<Car> cars);

    void sortByConsumption(List<Car> cars);

    List<Car> getCarsBySpeedParameters(List<Car> cars, int minSpeed, int maxSpeed);
}
