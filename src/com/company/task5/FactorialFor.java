package com.company.task5;

/**
 * Задание 7
 * Реализовать подсчет факториала используя цикл for.
 */
public class FactorialFor {
    public static void main(String[] args) {
        FactorialFor ff = new FactorialFor();
        ff.factorialFor();
    }

    public void factorialFor() {
        int i = 0, firstValue = 1, endValue = 20, result = 1;
        int random = firstValue + (int) (Math.random() * endValue);
        System.out.println("random = " + random);
        for (i = 1; i < random + 1; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + random + " = " + result);
    }
}
