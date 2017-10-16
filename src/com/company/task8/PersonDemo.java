package com.company.task8;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Полное имя и фамилия " +person1.fullName);
        System.out.println("Полное имя и фамилия " +person1.age);

        Person person2 = new Person("Богдан Марценюк",21);
        System.out.println(person2.fullName);
        System.out.println(person2.age);
    }
}
