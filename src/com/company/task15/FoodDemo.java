package com.company.task15;

public class FoodDemo {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable c = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Повор Петя");
            }
        };
        food.prepare(c);
    }
}
