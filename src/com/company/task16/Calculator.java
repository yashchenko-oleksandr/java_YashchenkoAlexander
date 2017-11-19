package com.company.task16;

public class Calculator {
    public static void main(String[] args) {
        System.out.printf("Сумма чисел %s и %s = %.2f\n",1,2.343,sum(1,2.343));
        System.out.printf("Умножение чисел %s и %s = %.2f\n",3,3.3f,multiply(3,3.3f));
        System.out.printf("Деление чисел %s и %s = %.2f\n",454L,3.54,divide(454L,3.54));
        System.out.printf("Разница чисел %s и %s = %.0f\n",124,546,subtraction(124,546));
    }

    static <T extends Number,V extends Number> double sum (T a, V b){
        return a.doubleValue()+b.doubleValue();
    }
    static <T extends Number,V extends Number> double multiply(T a, V b){
        return a.doubleValue()*b.doubleValue();
    }
    static <T extends Number,V extends Number> double divide(T a, V b){
        return a.doubleValue()/b.doubleValue();
    }
    static <T extends Number,V extends Number> double subtraction(T a, V b){
        return a.doubleValue()-b.doubleValue();
    }
}
