package com.company.task5;

/**
 * Работа на урове 06.10.2017
 * Задание 4
 * Распечатать все числа от 1 до 100. Используем цикл do-while.
 */
public class CycleDoWhile {
    public static void main(String[] args) {
        CycleDoWhile cdw = new CycleDoWhile();
        cdw.cycleDoWhile();
    }

    public void cycleDoWhile() {
        int account = 1;
        do {
            System.out.println("Число" + account);
            account++;
        } while (account < 101);
    }
}
