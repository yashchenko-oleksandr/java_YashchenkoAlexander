package com.company.task5;

/**
 * Работа на урове 06.10.2017
 * Задание 5
 * Распечатать 55 символов в одну строку начиная с ‘h’. Используем цикл for.
 */
public class CycleFor {
    public static void main(String[] args) {
        CycleFor cf = new CycleFor();
        cf.cyclaFor();
    }

    public void cyclaFor() {
        char tmp = 'h';
        int i = 0;
        for (i = 0; i < 55; i++) {
            System.out.print(tmp);
            tmp++;
        }
    }
}
