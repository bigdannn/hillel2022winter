package com.hillel.lesson_09.tasks;

import com.hillel.lesson_09.tasks.impl.TaxiServiceImpl;

import java.util.List;

public class TaxiRun {
    // Таксопарк. Определить иерархию легковых автомобилей.
    // Создать таксопарк.
    // Подсчитать стоимость автопарка.
    // Провести сортировку автомобилей парка по расходу топлива.
    // Найти автомобиль в компании, соответствующий заданному диапазону
    // параметров скорости.


    public static void main(String[] args) {
        List<Car> cars = new CarGenerator().getCars();
TaxiService ts = new TaxiServiceImpl();


        System.out.println(cars);
        ts.sortByConsumption(cars);
        System.out.println(cars);


        System.out.println(ts.getCarsBySpeedParameters(cars, 100, 150));

        System.out.println(ts.getCarTotalPrice(cars));
    }
}
