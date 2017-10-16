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
        numberLines = 5;
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
        //Добавить амперсант в цикл
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] += array1[i][j];
            }
        }
    }

    void print(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

            }
        }
    }
}
