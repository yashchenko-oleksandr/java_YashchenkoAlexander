package com.company.task7;

/**
 * Задание 4
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */
public class BubbleSorter {
    public static void main(String[] args) {
        BubbleSorter bs = new BubbleSorter();
        int[] array = {1, 2, 31, 4, 12, 5, 45};
        System.out.println("Неотсортированній массив");
        bs.print(array);
        bs.bubbleSort(array);
        System.out.println("\nОтсортированный массив");
        bs.print(array);
    }

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean close = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    close = false;
                }
            }
            if (close) {
                break;
            }
        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
