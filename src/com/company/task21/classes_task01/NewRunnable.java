package com.company.task21.classes_task01;

/**
 * Created by Ukrainian IT_SCHOOL on 01.12.2017.
 */
public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
