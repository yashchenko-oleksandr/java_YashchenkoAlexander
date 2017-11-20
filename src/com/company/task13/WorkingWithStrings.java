package com.company.task13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Выберите задание");
        System.out.println("Задание 2 - Дано два числа, например 3 и 56, необходимо составить следующие строки: \n" +
                "3 + 56 = 59 \n" +
                "3 – 56 = -53 \n" +
                "3 * 56 = 168. ");
        System.out.println("Задание 3 - Напишите метод, заменяющий в строке все вхождения «object oriented programming»(не учитываем регистр символов) на «OOP».");
        System.out.println("Задание 4 - Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака: \"string\" → \"ri\", \"code\" → \"od\", \"Practice\"→\"ct\".");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не вещественное число!");
        }
        switch (i) {
            case 2:
                numericString();
                break;
            case 3:
                enteringString();
                break;
            case 4:
                bisection();
                break;
            default:
                System.out.println("Нет такого задания");
                break;
        }
    }

    public static void numericString() {
        String s;
        int a = 3, b = 56;
        StringBuilder sb = new StringBuilder(10);

        s = sb.append("3").append("+").append("56").append("=").append(a + b).toString();
        sb.deleteCharAt(4);
        System.out.println(s);
        replace(sb);
        sb.delete(0, sb.capacity());

        s = sb.append("3").append("-").append("56").append("=").append(a - b).toString();
        sb.deleteCharAt(4);
        System.out.println(s);
        replace(sb);
        sb.delete(0, sb.capacity());

        s = sb.append("3").append("*").append("56").append("=").append(a * b).toString();
        sb.deleteCharAt(4);
        System.out.println(s);
        replace(sb);
    }

    public static void replace(StringBuilder sb) {
        sb.replace(4, 4, "равно");
        System.out.println(sb);
    }

    public static void enteringString() {
        String str = "Java is object oriented programming , word object oriented programming , Object oriented programming";
        String str1 = "(o|O)bject oriented programming";
        Pattern pattern = Pattern.compile(str1);
        Matcher m = pattern.matcher(str);
        str = m.replaceAll("OOP");
        System.out.println(str);
    }

    public static void bisection() {
        String str1 = "string", str2 = "code", str3 = "Practice";
        bisectionIf(str1);
        bisectionIf(str2);
        bisectionIf(str3);
    }

    public static void bisectionIf(String str) {
        if (str.length() % 2 == 0) {
            str = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        }
        System.out.println(str);
    }
}
