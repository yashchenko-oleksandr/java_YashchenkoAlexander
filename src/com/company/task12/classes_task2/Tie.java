package com.company.task12.classes_task2;

public class Tie extends Clothing implements MenClothing {
    public Tie() {
    }

    public Tie(ClothingSize clothingSize, int cost, String color) {
        super(clothingSize, cost, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressAMan() {
        System.out.println("На мужчине надет галстук" + this);
    }
}
