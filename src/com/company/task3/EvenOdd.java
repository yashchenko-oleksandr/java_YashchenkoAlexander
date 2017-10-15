package com.company.task3;

import java.util.Scanner;

/**
 * Класс, который сообщает, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если введёно не целое число, то программа выдаст сообщать ему об ошибке.
 */

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        eo.evenOdd();
    }

    public void evenOdd() {
        Scanner scanner = new Scanner(System.in);
        int enteredValue1;
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                enteredValue1 = scanner.nextInt();
                if (enteredValue1 % 2 == 0) {
                    System.out.println("  Вы ввели четное число!");
                } else {
                    System.out.println("  Вы ввели нечетное число!");
                }
            } else {
                System.out.println("  Вы ввели не целое число");
            }
        }
    }
}
