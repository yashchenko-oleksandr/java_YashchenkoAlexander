package com.company.task5;

/**
 * Работа на урове 06.10.2017
 * Задание 1
 * Передать на вход программы число от 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д. Если 6 или 7 – “Выходной”.
 * Используем конструкцию if-else-if.
 */
public class Days {
    public static void main(String[] args) {
        Days d = new Days();
        d.days(args);
    }

    public void days(String[] args) {
        for (String str : args) {
            int tmp = Integer.parseInt(str);
            if (tmp == 1) {
                System.out.println("Понедельник");
            } else if (tmp == 2) {
                System.out.println("Вторник");
            } else if (tmp == 3) {
                System.out.println("Среда");
            } else if (tmp == 4) {
                System.out.println("Четверг");
            } else if (tmp == 5) {
                System.out.println("Пятница");
            } else if (tmp == 6 || tmp == 7) {
                System.out.println("Выходной");
            }
        }
    }
}
