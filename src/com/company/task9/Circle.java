package com.company.task9;

/*Создать класс Circle, который содержит
        - переменную radius;
        - методы, вычисляющие площадь и длину окружности;
        - константу PI.
        Создать несколько объектов данного класса.*/
public class Circle {
    private int radius;
    static final double PI = 3.14;

    public Circle() {
        radius = 18;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(this.radius, 2);
    }

    public double length() {
        return 2 * PI * this.radius;
    }
}
