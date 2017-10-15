package com.company.task3;

/**
 * Ниже приведен кдасс, в котором последовательно прописаны преобразования всех совместимых примитивных типов друг к другу.
 */

public class Methods {
    public static void main(String[] args) {
        Methods met = new Methods();
        met.byte1();
        met.short1();
        met.char1();
        met.int1();
        met.long1();
        met.float1();
        met.double1();
    }

    public void byte1() {
        byte b = 8;
        short s = b;
        char c = (char) b;
        int i = b;
        long l = b;
        float f = b;
        double d = b;
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
    }

    public void short1() {
        short s = 8;
        byte b = (byte) s;
        char c = (char) s;
        int i = s;
        long l = s;
        float f = s;
        double d = s;
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
    }

    public void char1() {
        char c = 'y';
        byte b = (byte) c;
        short s = (short) c;
        int i = c;
        long l = c;
        float f = c;
        double d = c;
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
    }

    public void int1() {
        int i = 43;
        byte b = (byte) i;
        short s = (short) i;
        char c = (char) i;
        long l = i;
        float f = i;
        double d = i;
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
    }

    public void long1() {
        long l = 543;
        byte b = (byte) l;
        short s = (short) l;
        char c = (char) l;
        int i = (int) l;
        float f = l;
        double d = l;
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
    }

    public void float1() {
        float f = 43f;
        byte b = (byte) f;
        short s = (short) f;
        char c = (char) f;
        int i = (int) f;
        long l = (long) f;
        double d = f;
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
    }

    public void double1() {
        double d = 343.43;
        byte b = (byte) d;
        short s = (short) d;
        char c = (char) d;
        int i = (int) d;
        long l = (long) d;
        float f = (float) d;
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
    }
}


