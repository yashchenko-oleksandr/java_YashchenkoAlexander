package com.company.details;

public class Engine {
    private String manufacturer;
    private int power;

    public Engine() {
        manufacturer = "Бензин";
        power = 150;
    }

    public Engine(String manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", power=" + power +
                '}';
    }
}
