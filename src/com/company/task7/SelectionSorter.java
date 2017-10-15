package com.company.task7;

/**
 * Задание 8
 * Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент равен array[i].
 */
public class SelectionSorter {
    public static void main(String[] args) {
        int[] array = {4, 23, 4, 32, 5, 23, 5, 6, 765};
        SelectionSorter.sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {    // цикл выбора наименьшего элемента
                if (array[j] < x) {
                    k = j;    // k - индекс наименьшего элемента
                    x = array[j];
                }
            }
            if (x == array[i]) {
                continue;
            }
            array[k] = array[i];
            array[i] = x;    // меняем местами наименьший с array[i]
        }
    }

    public void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
