package com.company.task4;

/**
 * Задание 3
 * Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Используйте цикл for. Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
public class AverageValue {
    public static void main(String[] args) {
        AverageValue av = new AverageValue();
        av.averageValue(args);
    }

    public void averageValue(String[] args) {
        double sum = 0;
        double average = 0;
        for (String str : args) {
            double tmp = Double.parseDouble(str);
            sum += tmp;
        }
        average = sum / args.length;
        System.out.println("Среднее значение= " + average);
    }
}
