package com.company.task8;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать.
 */
public class Matrix {
    int numberLines, numberColumns;
    double[][] array;

    Matrix() {
        numberLines = 2;
        numberColumns = 2;
        array = new double[numberLines][numberColumns];
    }

    public Matrix(int numberLines, int numberColumns, double[][] array) {
        this.numberLines = numberLines;
        this.numberColumns = numberColumns;
        this.array = new double[numberLines][numberColumns];
        this.array = array;
    }

    void sumMatrixs(double[][] array1) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                this.array[i][j] += array1[i][j];
            }
        }
        print(array);
    }

    void multiplicationNumberOnMatrixs(int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                this.array[i][j] *= number;
            }
        }
        print(array);
    }

    void multiplicationMatrixsOnMatrixs(double[][] array1) {
        double[][] res = new double[this.numberLines][this.numberColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                for (int n = 0; n < array1.length; n++) {
                    res[i][j] += this.array[i][n] * array1[n][j];
                }
            }
        }
        print(res);
    }

    public void print(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
