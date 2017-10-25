package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carryung;

    public Lorry() {
        carryung = 2000;
    }

    public Lorry(String carClass, String marka, Engine engine, Driver driver, int carryung) {
        super(carClass, marka, engine, driver);
        this.carryung = carryung;
    }

    public int getCarryung() {
        return carryung;
    }

    public void setCarryung(int carryung) {
        this.carryung = carryung;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carryung=" + carryung +
                '}';
    }
}
