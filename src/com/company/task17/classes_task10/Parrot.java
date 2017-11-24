package com.company.task17.classes_task10;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class Parrot extends Pet {
    public Parrot(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Parrot{}"+super.toString();
    }
}
