package com.company.task4;

import java.util.Scanner;

/**
 * Работа на урове 06.10.2017
 * Задание 5
 * С помощью класса Scanner ввести целое число.
 * Если это число от 0 до 10, вывести на консоль сообщение“Положительное число меньше 10”, иначе вывести
 * сообщение “Положительное число больше 10 или отрицательное”. Используем оператор if-else.
 */
public class MoreLess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoreLess ml = new MoreLess();
        ml.moreLess(scanner);
    }

    public void moreLess(Scanner scanner) {
        int inpud = 0;
        System.out.println("Введите число");
        if (scanner.hasNextInt()) {
            inpud = scanner.nextInt();
            if (inpud >= 0 && inpud < 10) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
    }

}
