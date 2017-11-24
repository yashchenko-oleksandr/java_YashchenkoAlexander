package com.company.task17.classes_task10;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class Dog extends Pet{
    public Dog(String name, String address) {
        super(name,address);
    }

    @Override
    public String toString() {
        return "Dog{}"+super.toString();
    }
}
