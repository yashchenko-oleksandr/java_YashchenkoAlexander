package com.company.task16;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min(T[] array) {
        T min;
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min.doubleValue() > array[i].doubleValue()) {
                min = array[i];
            }
        }
        return min;
    }

    public T max(T[] array) {
        T max;
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.doubleValue() < array[i].doubleValue()) {
                max = array[i];
            }
        }
        return max;
    }
}
