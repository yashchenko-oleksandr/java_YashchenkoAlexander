package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carClass, marka;
    private Engine engine;
    private Driver driver;

    public Car() {
        carClass = "S";
        marka = "Ta";
        this.engine = new Engine("Бензин", 123);
        this.driver = new Driver("АБВ", 21, 3);
    }

    public Car(String carClass, String marka, Engine engine, Driver driver) {
        this.carClass = carClass;
        this.marka = marka;
        this.engine = engine;
        this.driver = driver;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", marka='" + marka + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Полная информация");
        System.out.println(this);
        System.out.println();
    }
}
