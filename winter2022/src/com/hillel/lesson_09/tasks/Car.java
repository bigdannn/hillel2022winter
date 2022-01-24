package com.hillel.lesson_09.tasks;

// Таксопарк. Определить иерархию легковых автомобилей.
public class Car {
    private int id;
    private String model;
    private String regNumber;
    private int fuelConsumption;
    private int price;
    private int maxSpeed;

    public Car(int id, String model, String regNumber, int fuelConsumption, int price, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.regNumber = regNumber;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (fuelConsumption != car.fuelConsumption) return false;
        if (price != car.price) return false;
        if (maxSpeed != car.maxSpeed) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return regNumber != null ? regNumber.equals(car.regNumber) : car.regNumber == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (regNumber != null ? regNumber.hashCode() : 0);
        result = 31 * result + fuelConsumption;
        result = 31 * result + price;
        result = 31 * result + maxSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}' + "\n";
    }
}
