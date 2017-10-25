package com.company.task9;

import java.util.Scanner;

/*
*Даны два целых числа A и В.
* Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
* Использовать рекурсию.
 */
public class DemoRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue, secondValue;
        System.out.println("Введите первое значение");
        firstValue = scanner.nextInt();
        System.out.println("Введите второе значение");
        secondValue = scanner.nextInt();
        Recursion recursion = new Recursion();
        recursion.recursion(firstValue, secondValue);
    }
}
