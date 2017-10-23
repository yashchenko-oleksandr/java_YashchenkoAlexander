package com.company.task10;

abstract public class Shape {
    private String colour;

    public Shape() {
        colour = "Красный";
    }

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    abstract public void draw();
}
