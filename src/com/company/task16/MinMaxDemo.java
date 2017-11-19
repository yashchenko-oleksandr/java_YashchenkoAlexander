package com.company.task16;

import java.util.Arrays;

public class MinMaxDemo {
    public static void main(String[] args) {
        Integer[] array1 = {2, 3, 4, 1, 6, 7};
        Double[] array2 = {2343.5, 56.324, 56.325, 76.2};
        MinMax<Integer> minMax1 = new MinMax<>(array1);
        MinMax<Double> minMax2 = new MinMax<>(array2);

        System.out.print("Минимальный элемент массива - " + Arrays.toString(array1) + " = ");
        System.out.println(minMax1.min(array1));
        System.out.print("Максимальный элемент массива - " + Arrays.toString(array2) + " = ");
        System.out.println(minMax2.max(array2));
    }
}
