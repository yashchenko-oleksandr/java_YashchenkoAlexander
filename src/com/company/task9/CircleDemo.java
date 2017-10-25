package com.company.task9;

/*
*Создать класс Circle, который содержит
 *  - переменную radius;
  *  - методы, вычисляющие площадь и длину окружности;
   *  - константу PI.
   *  Создать несколько объектов данного класса.
 */
public class CircleDemo {
    public static void main(String[] args) {
        Circle[] circle = new Circle[2];
        circle[0] = new Circle(12);
        circle[1] = new Circle(14);
        for (Circle c : circle) {
            System.out.println(c.area());
            System.out.println(c.length());
        }

    }
}
