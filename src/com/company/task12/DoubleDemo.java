package com.company.task12;

/**
 * Created by Ukrainian IT_SCHOOL on 03.11.2017.
 */
public class DoubleDemo {
    public static void main(String[] args) {
    doubleMethod();
    }

    public static void doubleMethod (){
        Double d1 = Double.valueOf(3.21);
        Double d2 = Double.valueOf("3.21");
        double d3 = Double.parseDouble("433.1");
        Double dOb = new Double(2.12);
        Double d4 = 123.34;

        System.out.println("valueOf"+d1);
        System.out.println("valueOf"+d2);
        System.out.println("parseDouble"+d3);

        byte b = dOb.byteValue();
        float fl = dOb.floatValue();
        short s = dOb.shortValue();
        int i = dOb.intValue();
        long l = dOb.longValue();
        System.out.println(" "+b + " " + fl + " " + s + " " + i + " " + l);

        String dOb1 = Double.toString(6.3);
        System.out.println("toString"+dOb1);

        System.out.println("Autobox"+d4);
    }

}
