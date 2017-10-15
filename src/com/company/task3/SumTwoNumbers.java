package com.company.task3;

import java.util.Scanner;

/**
 * Класс, который будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то программа сообщит об ошибке.
 */

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumTwoNumbers n = new SumTwoNumbers();
        n.sumTwoNumbers(scanner);
    }

    public void sumTwoNumbers(Scanner scanner) {
        int enteredValue1 = 0;
        int enteredValue2 = 0;
        int sum;
        System.out.println("Введите первое число: ");
        enteredValue1 = input(scanner);
        System.out.println("Введите второе число: ");
        enteredValue2 = input(scanner);
        sum = enteredValue1 + enteredValue2;
        System.out.println("Сумма двух целых чисел = " + sum);
    }

    public int input(Scanner scanner) {
        int tmp = 0;
        if (scanner.hasNextInt()) {
            tmp = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку, введенное вами значение приравнивается к 0!");
        }
        return tmp;
    }
}