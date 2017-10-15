package com.company.task7;

import java.util.Scanner;

/**
 * Задание 6
 * Реализовать задачу с гирляндой используя массивы. Для реализации бегущей строки используйте метод System.arraycopy(...);
 */
public class Garland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garland g = new Garland();
        int[] array = new int[32];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2);
        }
        switch (g.menu(scanner)) {
            case 1:
                g.garlandFlashing(array);
                break;
            case 2:
                g.garlandTicker(array);
                break;
            case 3:
                g.garlandOnOffFirstPosition(array);
                break;
            case 4:
                g.garlandCurrentState(array);
                break;
            default:
                System.out.println();
        }
    }

    public void garlandFlashing(int[] array) {
        for (int k = 0; k < 6; k++) {
            for (int i = 0; i < 32; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }

    public void garlandTicker(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array, 0, array, 1, 31);
            garlandCurrentState(array);
        }
    }

    public void garlandOnOffFirstPosition(int[] array) {
        if (array[0] == 1) {
            System.out.println("Первая лампочка включена!");
        } else {
            System.out.println("Первая лампочка выключена!");
        }
    }

    public void garlandCurrentState(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int menu(Scanner scanner) {
        int input = 0;
        System.out.println("Выберите один из пунквоменю ");
        System.out.println("1 - Мигание лампочками гирлянды  раз ");
        System.out.println("2 - Запуск гирлянды в режим бегущей строки ");
        System.out.println("3 - Проверка, включена ли лампочки на первой позиции");
        System.out.println("4 - Текущее состояние гирлянды. ");
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибк");
        }
        return input;
    }
}
