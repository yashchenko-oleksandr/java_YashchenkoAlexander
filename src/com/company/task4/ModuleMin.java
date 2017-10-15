package com.company.task4;

import java.util.Scanner;

/**
 * Задание 1
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */
public class ModuleMin {
    public static void main(String[] args) {
        ModuleMin mm = new ModuleMin();
        mm.moduleMin();
    }

    public void moduleMin() {
        double firstEntered = 0.0;
        double secondEntered = 0.0;
        double thirdEntered = 0.0;
        System.out.println("Введите первое число: ");
        firstEntered = inpud();
        System.out.println("Введите второе число: ");
        secondEntered = inpud();
        System.out.println("Введите третье число: ");
        thirdEntered = inpud();
        double firstAccount = Math.abs(firstEntered) > Math.abs(secondEntered) ? firstEntered : secondEntered;
        double secondAccount = Math.abs(thirdEntered) > Math.abs(firstAccount) ? thirdEntered : firstAccount;
        System.out.println("Большее по модулю среди трех введенных" + secondAccount);
    }

    public double inpud() {
        Scanner scanner = new Scanner(System.in);
        double tmp = 0.0;
        if (scanner.hasNextDouble()) {
            tmp = scanner.nextDouble();
        } else {
            System.out.println("Вы ввели не вещественное число!");
        }
        return tmp;
    }

}