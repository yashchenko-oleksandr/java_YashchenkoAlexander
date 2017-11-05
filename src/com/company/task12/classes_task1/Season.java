package com.company.task12.classes_task1;

public enum Season {
    WINTER(-20) {
        public String getDescriptiom() {
            return "Холодное время года!";
        }
    },
    SPRING(14) {
        public String getDescriptiom() {
            return "Время года, когда все расцветает";
        }
    },
    SUMMER(30),
    AUTUMN(10) {
        public String getDescriptiom() {
            return "Время года когда все опадает=(";
        }
    };
    Season size;

    Season(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public String getDescriptiom() {
        return "Жаркое время года!";
    }

}
