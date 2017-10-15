package com.company.task6;

/**
 * Задание 3
 * Создать массив типа String размером 3х6. И записать в него значения:
 * Используете цикл for.
 * a1 a2 a3	a4	a5	a6
 * b1 b2 b3	b4	b5	b6
 * c1 c2 c3	c4	c5	c6
 * И распечатать.
 */
public class MultidimensionalString {
    public static void main(String[] args) {
        MultidimensionalString m = new MultidimensionalString();
        m.multidimensionalString();
    }

    public void multidimensionalString() {
        String[][] multidimensional = new String[3][6];
        char variable = 'a';
        int i = 0, j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                multidimensional[i][j] = variable + Integer.toString(j + 1);
            }
            variable++;
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print(multidimensional[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
