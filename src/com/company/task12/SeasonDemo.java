package com.company.task12;

/**
 * Created by Ukrainian IT_SCHOOL on 30.10.2017.
 */
public class SeasonDemo {

    public static void main(String[] args) {
        Season season = Season.SUMMER;
        if (season == Season.SUMMER) {
            System.out.println(season);
        }

        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю весну!");
                break;
        }
        System.out.println("Использывание методов values() and valueOf()");
        Season seasonMe;
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s);
        }
        System.out.println();
        seasonMe = Season.valueOf("SUMMER");
        System.out.println("Мое любимое время года - " + seasonMe);

        System.out.println("");
        System.out.println("Средне зачение для каждой поры года");
        for (Season seasonTemperature : Season.values()) {
            System.out.println(seasonTemperature + " " + seasonTemperature.getTemperature());
        }

    }
}
