package com.company.task4;

import java.util.Scanner;

/**
 * Задание 2
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 */
public class Garland {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Garland g = new Garland();
        int tmp1 = 1;
        switch (g.menu(scanner)) {
            case 1:
                g.garlandFlashing(tmp1);
                break;
            case 2:
                g.garlandTicker(tmp1);
                break;
            case 3:
                g.garlandOnOffFirstPosition(tmp1);
                break;
            case 4:
                g.garlandCurrentState(tmp1);
                break;
            default:
                System.out.println();
        }
    }

    public void garlandFlashing(int tmp1) throws InterruptedException {
        int i;
        for (i = 0; i < 5; i++) {
            garlandCurrentState(tmp1);
            System.out.println(Integer.toBinaryString(~tmp1));
            Thread.sleep(1000);
        }
    }

    public void garlandTicker(int tmp1) {
        int tmp = tmp1;
        for (int i = 0; i < 31; i++) {
            tmp = tmp << 1;
            garlandCurrentState(tmp);
        }
    }

    public void garlandOnOffFirstPosition(int tmp1) {
        int maska = 1;
        if ((tmp1 & maska) == 1) {
            System.out.println("Первая лампочка вклюена!");
        } else {
            System.out.println("Первая лампочка выключена!");
        }
    }

    public void garlandCurrentState(int tmp1) {
        System.out.println(print(tmp1));
    }

    public String print(int tmp1) {
        String str = Integer.toBinaryString(tmp1);
        int tmp2 = str.length();
        for (int i = 0; i < (32 - tmp2); i++) {
            str = "0" + str;
        }
        return str;
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
