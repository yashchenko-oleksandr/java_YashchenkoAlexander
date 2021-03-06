package com.company.task10.classes_task2;

public class Rectangle extends Shape {
    private int x1, x2, y1, y2;

    public Rectangle(int x, int y) {
        this.x1 = 35;
        this.y1 = 35;
        this.x2 = 67;
        this.y2 = 67;
    }

    public Rectangle(String colour, int x1, int y1, int x2, int y2) {
        super(colour);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (x1 != rectangle.x1) return false;
        if (x2 != rectangle.x2) return false;
        if (y1 != rectangle.y1) return false;
        return y2 == rectangle.y2;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;
        return result;
    }

    public void draw() {
        System.out.println("Рисую прямоугольник с цветом " + getColour() + ", с координатами: нижний левый " + x1 + ":" + y1 + " верхний правый " + x2 + ":" + y2);
    }
}
