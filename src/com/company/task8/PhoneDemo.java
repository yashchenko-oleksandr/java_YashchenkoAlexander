package com.company.task8;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.receiveCall("Виталя");
        phone1.number = "+380977434123";
        System.out.println(phone1.getPhoneNumber());
        phone1.model = "Apple 7";
        phone1.weight = 123;

        phone2.receiveCall("Саша");
        phone2.number = "+380977434124";
        System.out.println(phone2.getPhoneNumber());
        phone2.model = "Samsung G8";
        phone2.weight = 124;

        phone3.receiveCall("Бодя");
        phone3.number = "+380977434125";
        System.out.println(phone3.getPhoneNumber());
        phone3.model = "HP";
        phone3.weight = 125;

        Phone phone4 = new Phone();
        System.out.println("Модель 4 обьекта = " + phone4.model);

        Phone phone5 = new Phone("+380994444444", "Nokia", 123);
        System.out.println(phone5.number);
        System.out.println(phone5.model);
        System.out.println(phone5.weight);

        phone5.receiveCall("Вася", "+380995555555");
    }
}
