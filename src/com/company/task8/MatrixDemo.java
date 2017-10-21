package com.company.task8;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2, new double[][]{{2, 3}, {2, 3}});

        Matrix matrix2 = new Matrix(2, 2, new double[][]{{1, 3}, {3, 9}});
        Matrix result = new Matrix(2,2);

        System.out.println("Сумма двух матриц:");
        result = matrix1.sumMatrixs(matrix2);
        result.print();
        System.out.println("Матрица умноженная на число");
        int number = 4;
        result = matrix2.multiplication(number);
        result.print();
        System.out.println("Умножение матрицы на матрицу:");
        result = matrix1.multiplication(matrix2);
        result.print();

    }
}
