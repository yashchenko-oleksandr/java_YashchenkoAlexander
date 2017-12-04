package com.company.task21;

/**
 * Created by Ukrainian IT_SCHOOL on 04.12.2017.
 */
public class StringThreadDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("A");
        StringThread thread1 = new StringThread(str);
        StringThread thread2 = new StringThread(str);
        StringThread thread3 = new StringThread(str);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
