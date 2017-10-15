package com.company.task6;

/**
 * Задание 1
 * Создать массив типа String с размером 7.
 * Записать в него значения дней недели.
 * Вывести на консоль значение последнего элемента.
 */
public class ArrayString {
    public static void main(String[] args) {
        ArrayString as = new ArrayString();
        as.arrayString();
    }

    public void arrayString() {
        String[] daysWeek = new String[7];
        daysWeek[0] = "Понедельник";
        daysWeek[1] = "Вторник";
        daysWeek[2] = "Среда";
        daysWeek[3] = "Четверг";
        daysWeek[4] = "Пятница";
        daysWeek[5] = "Суббота";
        daysWeek[6] = "Воскресенье";
        System.out.println(daysWeek[6]);
    }
}
