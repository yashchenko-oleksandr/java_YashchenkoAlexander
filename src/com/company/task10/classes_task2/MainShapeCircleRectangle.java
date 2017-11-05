package com.company.task10.classes_task2;

/*
*Создайте суперкласс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
* Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
* В цикле нарисовать их (вызвать метод draw).
* Добавить метод equals()  для классов Shape, Circle, Rectangle. (Задание с урока)
 */
public class MainShapeCircleRectangle {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle("зеленый", 36, 36);
        shape[1] = new Rectangle("красный", 0, 0, 40, 20);
        for (Shape sh : shape) {
            sh.draw();
        }
        System.out.println("Метод equals для класса Circle");
        Shape shape1 = new Circle("f",32,32);
        Shape shape2 = new Circle("f",32,32);
        Shape shape3 = shape1;
        System.out.println(shape1==shape3);
        System.out.println(shape1.equals(shape2));
        System.out.println("Метод equals для класса Rectangle");
        Shape shape4 = new Rectangle("f",0,0,40,20);
        Shape shape5 = new Rectangle("f",0,0,40,20);
        Shape shape6 = shape4;
        System.out.println(shape4==shape6);
        System.out.println(shape4.equals(shape5));
    }
}
