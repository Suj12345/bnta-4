package com.bnta.week_three_mon.Into_to_classes;

public class DealershipService {
    public int countCars(Dealership dealership){
        int carCount = 0;
        for (int i = 0; i < dealership.getCars().length; i++) {
            if (dealership.getCars()[i]!=null){
                carCount++;
            }
        }
        return carCount;
    }

    public void addCar(Dealership dealership, Car newCar){
        for (int i = 0; i < dealership.getCars().length; i++) {
            if (dealership.getCars()[i]==null){
                dealership.getCars()[i] = newCar;
                break;
            }
        }
    }

    public Car findCarByManufacturer(Dealership dealership, String desiredManufacturer) {
        // This method is supposed to find the FIRST car with the desired manufacturer
        // Otherwise you would need to find the number of cars with the desired manufacturer
        // first and then make an array equal to that size then add those cars

        for (Car car : dealership.getCars()) { //use enhanced for loop so can refer to each car within car array
            if (car!= null && car.getManufacturer().equals(desiredManufacturer)) {
                return car;
            }
        }
        return null;
    }
}


