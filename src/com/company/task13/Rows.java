package com.company.task13;

/**
 * Created by Ukrainian IT_SCHOOL on 03.11.2017.
 */
public class Rows {
    public static void main(String[] args) {
        String row = "I like Java!!!";
        rowsMethod(row);
    }

    public static void rowsMethod(String str) {
        System.out.println("Последний символ - " + str.charAt(str.length() - 1));
        System.out.println("Окончние строки сиволами '!!!' - " + str.endsWith("!!!"));
        System.out.println("Начинается ли стока подстрокой 'I like' - " + str.startsWith("I like"));
        System.out.println("Позиция сроки 'Java' - " + str.indexOf("Java"));
        System.out.println("Заменить все символы а на о. Строка до замены: " + str + " После - " + str.replace('a', 'o'));
        System.out.println("Преобразование строки к верхнему регистру - " + str.toUpperCase());
        System.out.println("Преобразование строки к нижнему регистру - " + str.toLowerCase());
        System.out.println("Вырезать строку Java - " + str.substring(0, 6) + str.substring(11, 14));
    }
}
