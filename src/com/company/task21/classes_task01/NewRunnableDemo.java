package com.company.task21.classes_task01;

/**
 * Created by Ukrainian IT_SCHOOL on 01.12.2017.
 */
public class NewRunnableDemo {
    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();

        Thread thread1 = new Thread(newRunnable);
        Thread thread2 = new Thread(newRunnable);
        Thread thread3 = new Thread(newRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
