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
        this.array = array;
    }

    public Matrix(int numberLines, int numberColumns) {
        this.numberLines = numberLines;
        this.numberColumns = numberColumns;
        this.array = new double[this.numberLines][this.numberColumns];
    }

    Matrix sumMatrixs(Matrix matrix) {
        Matrix result = new Matrix(this.numberLines, this.numberColumns);
        for (int i = 0; i < this.array.length && i < matrix.array.length; i++) {
            for (int j = 0; j < this.array[0].length && j < matrix.array[i].length; j++) {
                result.array[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        return result;
    }

    Matrix multiplication(int number) {
        Matrix matrix = new Matrix(this.numberLines, this.numberColumns);
        for (int i = 0; i < matrix.array.length; i++) {
            for (int j = 0; j < matrix.array[i].length; j++) {
                matrix.array[i][j] = number * this.array[i][j];
            }
        }
        return matrix;
    }

    Matrix multiplication(Matrix matrix) {
        Matrix result = new Matrix(this.numberLines, matrix.numberColumns);
        if (this.numberColumns == matrix.numberLines) {
            for (int i = 0; i < this.array.length; i++) {
                for (int j = 0; j < matrix.array[0].length; j++) {
                    for (int n = 0; n < matrix.array.length; n++) {
                        result.array[i][j] += (this.array[i][n] * matrix.array[n][j]);
                    }
                }
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
