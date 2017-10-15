package com.company.task5;

/**
 * Работа на урове 06.10.2017
 * Задание 2
 * Переписать задание 1 используя switch.
 */
public class DaysSwitch {
    public static void main(String[] args) {
        DaysSwitch d = new DaysSwitch();
        d.daysSwitch(args);
    }

    public void daysSwitch(String[] args) {

        for (String str : args) {
            int tmp = Integer.parseInt(str);
            switch (tmp) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                case 7:
                    System.out.println("Выходной");
                    break;
                default:
                    System.out.println("Ошибка!");
            }
        }
    }
}
