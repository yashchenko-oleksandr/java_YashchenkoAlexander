package com.company.task8;

/**
 * Задание 2
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk().
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */
public class Person {
    String fullName;
    int age;

    Person() {
        fullName = "Александр Ященко";
        age = 21;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {

    }

    void talk() {

    }

}
