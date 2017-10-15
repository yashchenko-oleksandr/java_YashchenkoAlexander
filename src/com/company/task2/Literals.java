package com.company.task2;

/**
 * Created by Ukrainian IT_SCHOOL on 02.10.2017.
 */
public class Literals {
    public static void main(String[] args) {
        Literals.task1();
        Literals.task2();
    }

    public static void task1() {
        //а) логический литерал
        boolean a = true;
        System.out.println(a);
        //б) строковый
        String b = "Hi";
        System.out.println(b);
        //в) символьный
        char c = 'c';
        System.out.println(c);
        //г) целочисленный 2-й
        int d = 0b101;
        System.out.println(d);
        //д) целочисленный 8-й
        int e = 06;
        System.out.println(e);
        //е) целочисленный 10-й
        int f = -324;
        System.out.println(f);
        //ж) целочисленный 16-й
        int g = 0X0005;
        System.out.println(g);
        //з) литерал типа float
        float h = 32.3f;
        System.out.println(h);
        //е) литерал типа double.
        double i = 43.3;
        System.out.println(i);
    }

    public static void task2() {
        byte b1 = 50, b2 = -99;
        //short k = b1 + b2; //ошибка компиляции
        short k = (short) (b1 + b2); //правильно
        int j = b1 + b2; //правильно
        System.out.println("k=" + k + "j=" + j);
    }
}
