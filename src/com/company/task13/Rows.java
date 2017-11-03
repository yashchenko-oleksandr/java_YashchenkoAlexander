package com.company.task13;

/**
 * Created by Ukrainian IT_SCHOOL on 03.11.2017.
 */
public class Rows {
    public static void main(String[] args) {
        String row = "I like Java";
        rowsMethod(row);
    }

    public static void rowsMethod(String arg) {
        System.out.println("Последний символ" + arg.charAt(arg.length() - 1));
        System.out.println("Окончние строки сиволами '!!!'" + arg.endsWith("!!!"));
        System.out.println("Начинается ли стока подстрокой 'I like'" + arg.startsWith("I like"));
    }
}
