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

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return colour != null ? colour.equals(shape.colour) : shape.colour == null;
    }

    @Override
    public int hashCode() {
        return colour != null ? colour.hashCode() : 0;
    }

    abstract public void draw();
}
