package com.company.task4;

/**
 * Работа на урове 06.10.2017
 * Задание 4
 * Передать на вход программы число в качестве аргумента.
 * Если оно нечетное, распечатать его.
 * Используем оператор if.
 */
public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd m = new EvenOdd();
        m.func(args);
    }

    public void func(String[] args) {
        for (String str : args) {
            int n = Integer.parseInt(str);
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
    }
}


