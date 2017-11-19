package com.company.task15;

import com.company.task9.Circle;

import java.util.Arrays;

public class InformAboutClass {
    public static void main(String[] args) {
        printInfo(Circle.class);
    }

    public static void printInfo(Class classes) {
        System.out.println("Class name " + classes.getName());
        System.out.println("In package " + classes.getPackage());
        System.out.println("Is Array? " + classes.isArray());
        System.out.println("Is Interface? " + classes.isInterface());
        System.out.println("Is Primitive? " + classes.isPrimitive());
        System.out.println("Constructors - " + Arrays.toString(classes.getConstructors()));
        System.out.println("Methods - " + Arrays.toString(classes.getMethods()));
    }
}
