package com.bnta.week_three_mon.Into_to_classes;

import java.util.Arrays;
import java.util.Objects;

public class Dealership {
    private String name;
    private int maxCars;
    private Car[] cars; //cars in stock

    public Dealership(String name, int maxCars, Car[] cars) {
        this.name = name;
        this.maxCars = maxCars;
        this.cars = new Car[maxCars]; //every new dealer starts with blank array of cars
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", maxCars=" + maxCars +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dealership that = (Dealership) o;
        return maxCars == that.maxCars && Objects.equals(name, that.name) && Arrays.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, maxCars);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }
}
