package com.company.task7;

/**
 * Задание 5
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        int array[][] = {
                {3, 4, 6, 12, 65, 5, 567, 12},
                {54, 4, 12, 6, 57, 1, 6, 32},
                {1, 6, 3, 7, 23, 87, 23, 6},
                {98, 23, 25, 8, 32, 6, 1, 4},
                {12, 43, 76, 2, 7, 9, 12, 76}
        };
        ArrayMinMax amm = new ArrayMinMax();
        System.out.println("Неотсортированный массив");
        amm.print(array);
        System.out.println("Отсортированный массив");
        int [][] array2 = amm.arrayMinMax(array);
        amm.print(array2);
        //am.print(am.arrayMinMax(array));
    }

    public  int[][] arrayMinMax(int[][] array) {
        int array2[][] = new int[5][2];
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            array2[i][0] = min;
            array2[i][1] = max;
        }
        return array2;
        //System.out.println(Arrays.deepToString(array2));
    }

    public void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
