package com.company.task9;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class DemoCarDriverEngine {
    public static void main(String[] args) {
        Driver driver = new Driver("Саня", 21, 3);
        Engine engine = new Engine("Газ", 100);
        Car[] car = new Car[3];
        car[0] = new Car("D", "w3", engine, driver);
        car[1] = new Lorry();
        car[2] = new SportCar();
        for (Car c : car) {
            c.stop();
            c.start();
            c.turnLeft();
            c.turnRight();
            c.printInfo();
        }
        System.out.println();
    }
}
