package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar() {
        speed = 200;
    }

    public SportCar(String carClass, String marka, Engine engine, Driver driver, int speed) {
        super(carClass, marka, engine, driver);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
