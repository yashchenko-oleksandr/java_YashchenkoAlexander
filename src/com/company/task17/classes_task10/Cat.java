package com.company.task17.classes_task10;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class Cat extends Pet {
    public Cat(String name, String address) {
        super(name,address);
    }

    @Override
    public String toString() {
        return "Cat{}"+super.toString();
    }
}
