package com.company.task12;

/**
 * Created by Ukrainian IT_SCHOOL on 30.10.2017.
 */
public enum Season {
    WINTER(-20), SPRING(14), SUMMER(30), AUTUMN(10);
    Season size;
    Season(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;

    public int getTemperature() {
        return temperature;
    }
}
