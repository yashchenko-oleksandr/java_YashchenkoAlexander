package com.company.task8;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println("Звонит " + phone1.receiveCall());
        phone1.number = "+380977434123";
        phone1.model = "Apple";
        phone1.weight = 123;
        System.out.println("Звонит " + phone1.receiveCall());
        System.out.println(phone1.getPhoneNumber("fd"));
        phone2.number = "+380977434124";
        phone2.model = "Samsung";
        phone2.weight = 124;
        System.out.println("Звонит " + phone1.receiveCall());
        phone3.number = "+380977434125";
        phone3.model = "HP";
        phone3.weight = 125;
    }
}
