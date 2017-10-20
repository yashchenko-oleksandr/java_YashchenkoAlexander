package com.company.task9;

/**
 * Задание 1
 * Доделать класс Phone. (Задание с урока)
 * з) Создать метод sendMessage  с аргументами переменной длины.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.  \
 * и) Изменить класс Phone в соответствии с концепцией JavaBean.
 * к) Реализовать подсчет количества созданных телефонов с помощью статической переменной.
 */
public class Phone {
    private String number, model;
    private int weight;
    static int count=0;

    Phone() {
        number = "+380932376456";
        model = "Lenova K5";
        weight = 432;
        count++;
    }

    Phone(String number, String model, int weight) {
        this();
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getPhoneNumber() {
        return number;
    }

    void receiveCall(String name, String numver) {
        System.out.println("Звонит " + name + "\nНомер телефона - " + numver);
    }

    void sendMessage(String... array) {
        for (String a : array)
            System.out.println("Телефон: " + a);
    }
}
