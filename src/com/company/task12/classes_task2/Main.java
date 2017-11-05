package com.company.task12.classes_task2;

public class Main {
    public static void main(String[] args) {

        Clothing[] clothing = new Clothing[4];

        clothing[0] = new TShirt(ClothingSize.XS, 124, "Голубая");
        clothing[1] = new Pants(ClothingSize.XS, 1432, "Синие");
        clothing[2] = new Skirt(ClothingSize.S, 450, "Розовая");
        clothing[3] = new Tie();

        Studio.dressAMan(clothing);
        Studio.dressWoman(clothing);
    }
}
