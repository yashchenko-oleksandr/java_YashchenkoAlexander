package com.company.task5;

/**
 * Работа на урове 06.10.2017
 * Задание 3
 * Распечатать 10 строк:
 * “Task1”.
 * “Task2”.
 * …
 * “Task10”.
 * Используем цикл while.
 */
public class CycleWhile {
    public static void main(String[] args) {
        CycleWhile cw = new CycleWhile();
        cw.cycleWhile();
    }

    public void cycleWhile() {
        int account = 0;
        while (account < 10) {
            account++;
            System.out.println("Task" + account);
        }
    }
}
