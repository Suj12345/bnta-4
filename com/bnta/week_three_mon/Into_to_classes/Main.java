package com.bnta.week_three_mon.Into_to_classes;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 30_000, EngineType.DIESEL);
        Car car2 = new Car("Honda", 10_000, EngineType.PETROL);
        Car car3 = new Car("Tesla", 60_000, EngineType.ELECTRIC);

        Dealership dealership = new Dealership("Suj's", 5, new Car[5]);
        DealershipService dealershipService = new DealershipService();
        dealershipService.addCar(dealership, car1);
        dealershipService.addCar(dealership, car2);
        dealershipService.addCar(dealership, car3);

        int carCount = dealershipService.countCars(dealership);
        System.out.println("Number of cars in dealership: " + carCount);
        Car foundCar = dealershipService.findCarByManufacturer(dealership, "Tesla");
        System.out.println("Tesla in dealership: " + foundCar);
        Car missingCar = dealershipService.findCarByManufacturer(dealership, "Mercedes");
        System.out.println("Mercedes in dealership: " + missingCar);
    }
}
