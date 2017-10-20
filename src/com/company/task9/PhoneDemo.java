package com.company.task9;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.receiveCall("Виталя");
        phone1.setNumber("+380977434123");
        System.out.println(phone1.getNumber());
        phone1.setModel("Apple 7");
        phone1.setWeight(123);

        phone2.receiveCall("Саша");
        phone2.setNumber("+380977434124");
        System.out.println(phone2.getNumber());
        phone2.setModel("Samsung G8");
        phone2.setWeight(123);

        phone3.receiveCall("Бодя");
        phone3.setNumber("+380977434125");
        System.out.println(phone3.getNumber());
        phone3.setModel("HP");
        phone3.setWeight(125);

        Phone phone4 = new Phone();
        System.out.println("Модель 4 обьекта = " + phone4.getModel());

        Phone phone5 = new Phone("+380994444444", "Nokia", 123);
        System.out.println(phone5.getNumber());
        System.out.println(phone5.getModel());
        System.out.println(phone5.getWeight());

        phone5.receiveCall("Вася", "+380995555555 ");

        phone5.sendMessage(phone1.getPhoneNumber(), phone2.getPhoneNumber());
        phone5.sendMessage("2134324234", "32432423423");

        System.out.println("Количество созданных телефонов = " + Phone.count);
    }
}
