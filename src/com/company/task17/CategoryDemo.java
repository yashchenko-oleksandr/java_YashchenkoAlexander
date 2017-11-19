package com.company.task17;

import java.util.Set;
import java.util.TreeSet;

public class CategoryDemo {
    public static void main(String[] args) {
        Set<Product> products1 = new TreeSet<>();
        products1.add(new Product("Помидор", 12, 2));
        products1.add(new Product("Огурец", 8, 3));

        Set<Product> products2 = new TreeSet<>();
        products2.add(new Product("Ананас", 54, 5));

        Category category1 = new Category("Овощи", products1);
        Category category2 = new Category("Фрукты", products2);

        category1.printCategory();
        category2.printCategory();
    }
}
