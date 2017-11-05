package com.company.task10.classes_task2;

public class Circle extends Shape {
    private int x, y;

    public Circle(int x, int y) {
        this.x = 21;
        this.y = 21;
    }

    public Circle(String colour, int x, int y) {
        super(colour);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        return y == circle.y;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    public void draw() {
        System.out.println("Рисую крус с цветом " + getColour() + ", Координатами " + x + ":" + y);
    }
}
