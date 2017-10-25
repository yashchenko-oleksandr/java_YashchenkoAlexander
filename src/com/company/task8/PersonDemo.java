package com.company.task8;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Полное имя и фамилия " + person1.getFullName());
        System.out.println("Возраст " + person1.getAge());

        person1.move();
        person1.talk();

        Person person2 = new Person("Богдан Марценюк", 20);
        System.out.println(person2);

        person2.move();
        person2.talk();
    }
}
