package com.company.task12.classes_task2;

public class Studio {
    public static void dressAMan(Clothing[] clothing) {
        System.out.println("Это мужская одежда");
        for (Clothing c : clothing) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressAMan();
            }
        }
    }

    public static void dressWoman(Clothing[] clothing) {
        System.out.println("Это женская одежда!");
        for (Clothing c : clothing) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWoman();
            }
        }
    }
}
