package com.company.task9;

/**
 * Задание 1
 */
public class Phone {
    String number, model;
    int weight;

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getPhoneNumber() {
        return number;
    }

    Phone() {
        number = "+380932376456";
        model = "Lenova K5";
        weight = 432;
    }

    Phone(String number, String model, int weight) {
        this();
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name, String numver) {
        System.out.println("Звонит " + name + "\nНомер телефона - " + numver);
    }

    void sendMessage(String... array) {
        for (String a : array)
            System.out.println("Телефон: " + a);
    }
}
