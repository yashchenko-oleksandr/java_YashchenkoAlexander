package com.company.task21.classes_task01;

/**
 * Created by Ukrainian IT_SCHOOL on 01.12.2017.
 */
public class NewThread extends Thread {
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i + " - a" + Thread.currentThread().getName());
        }
    }
}
