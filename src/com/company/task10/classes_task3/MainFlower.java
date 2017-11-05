package com.company.task10.classes_task3;

public class MainFlower {
    public static void main(String[] args) {
        double allValue1 = 0;
        int allCount1 = 0;
        Flower[] flawer1 = new Flower[6];
        flawer1[0] = new Rose("Роза", "Пять дней", 14);
        flawer1[1] = new Rose();
        flawer1[2] = new Carnations("Гвоздики", "Шесть дней", 8);
        flawer1[3] = new Carnations("Гвоздики", "Шесть дней", 9);
        flawer1[4] = new Tulips("Тюльпан", "Один день", 21.50);
        flawer1[5] = new Tulips("Тюльпан", "Один день", 21.75);
        System.out.println("В первом букете");
        print(flawer1, allValue1, allCount1);

        double allValue2 = 0;
        int allCount2 = 0;
        Rose.count = 0;
        Carnations.count = 0;
        Tulips.count = 0;
        Flower[] flawer2 = new Flower[5];
        flawer2[0] = new Rose("Роза", "Пять дней", 41);
        flawer2[1] = new Rose();
        flawer2[2] = new Carnations("Гвоздики", "Шесть дней", 12.50);
        flawer2[3] = new Carnations("Гвоздики", "Шесть дней", 9);
        flawer2[4] = new Tulips("Тюльпан", "Один день", 41.50);
        System.out.println("Во втором букете");
        print(flawer2, allValue2, allCount2);

        double allValue3 = 0;
        int allCount3 = 0;
        Rose.count = 0;
        Carnations.count = 0;
        Tulips.count = 0;
        Flower[] flawer3 = new Flower[4];
        flawer3[0] = new Rose("Роза", "Пять дней", 19);
        flawer3[1] = new Rose();
        flawer3[2] = new Carnations("Гвоздики", "Шесть дней", 13);
        flawer3[3] = new Tulips("Тюльпан", "Один день", 25.50);
        System.out.println("В третьем букете");
        print(flawer3, allValue3, allCount3);
    }

    public static void print(Flower[] flawer, double allValue, int allCount) {
        for (Flower fl : flawer) {
            allValue += fl.value();
        }
        allCount = Rose.count + Carnations.count + Tulips.count;
        System.out.println("В букете цветов - " + allCount);
        System.out.println("Стоимость букета - " + allValue);
    }
}
