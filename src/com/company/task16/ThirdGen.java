package com.company.task16;

import com.company.task10.classes_task4.Animal;

import java.io.Serializable;

public class ThirdGen<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    T obj1;
    V obj2;
    K obj3;

    public ThirdGen(T obj1, V obl2, K obj3) {
        this.obj1 = obj1;
        this.obj2 = obl2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }

    public K getObj3() {
        return obj3;
    }

    public void setObj3(K obj3) {
        this.obj3 = obj3;
    }

    public void showNameClasses() {
        System.out.println("Type of T is " + obj1.getClass().getName());
        System.out.println("Type of V is " + obj2.getClass().getName());
        System.out.println("Type of K is " + obj3.getClass().getName());
    }

    public static void main(String[] args) {
        ThirdGen<String, Animal, Integer> tgObj = new ThirdGen<>("dsf", new Animal(), 83);
        tgObj.showNameClasses();

        String v = tgObj.getObj1();
        System.out.println("value: " + v);
        Animal str = tgObj.getObj2();
        System.out.println("value: " + str);
        int v1 = tgObj.getObj3();
        System.out.println("value: " + v1);
    }
}
