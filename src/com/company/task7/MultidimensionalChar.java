package com.company.task7;

import java.util.Arrays;

/**
 * Создать двумерный массив типа char размером 4х2.
 * И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */
public class MultidimensionalChar {
    public static void main(String[] args) {
        MultidimensionalChar mc = new MultidimensionalChar();
        mc.multidimensionalChar();
    }

    public void multidimensionalChar() {
        char[][] multidimensional = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'g', 'h'}
        };
        System.out.println(Arrays.deepToString(multidimensional));
    }
}
