package com.company.task6;

/**
 * Задание 2
 * Создать массив типа  double с размером 4.
 * Записать в него любые значения с помощью блока для инициализации.
 * Вывести на консоль значение первого элемента.
 */
public class ArrayDouble {
    public static void main(String[] args) {
        ArrayDouble ad = new ArrayDouble();
        ad.arrayDouble();
    }

    public void arrayDouble() {
        double[] number = {324.0, 43.23, 2.3, 13.3};
        System.out.println(number[0]);
    }
}
