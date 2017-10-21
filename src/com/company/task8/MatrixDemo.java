package com.company.task8;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2, new double[][]{{2, 3}, {2, 3}});

        Matrix matrix2 = new Matrix(2, 2, new double[][]{{1, 3}, {3, 9}});
        matrix1.array = new double[][] {};

        System.out.println("Сумма двух матриц:");
        matrix1.sumMatrixs(matrix2.array);
        System.out.println("Матрица умноженная на число");
        int number = 4;
        matrix2.multiplicationNumberOnMatrixs(number);
        System.out.println("Умножение матрицы на матрицу:");
        matrix1.multiplicationMatrixsOnMatrixs(matrix2.array);
    }
}
