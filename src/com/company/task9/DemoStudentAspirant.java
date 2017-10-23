package com.company.task9;

/**
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * Создать переменную типа Student, которая ссылается на объект типа Aspirant. (Задание с урока)
 */
public class DemoStudentAspirant {
    public static void main(String[] args) {
        Student student = new Aspirant("Петя", "Пупкин", "35", "Работа1");
        System.out.println(student);
    }
}
