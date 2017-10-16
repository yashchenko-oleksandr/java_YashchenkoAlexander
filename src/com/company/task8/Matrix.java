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
        this.array=array;
    }


    void print(){

    }
}
