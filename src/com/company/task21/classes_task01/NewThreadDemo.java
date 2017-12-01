package com.company.task21.classes_task01;

/**
 * Created by Ukrainian IT_SCHOOL on 01.12.2017.
 */
public class NewThreadDemo {
    public static void main(String[] args) {
        NewThread newThread1 = new NewThread();
        NewThread newThread2 = new NewThread();

        newThread1.start();
        newThread2.start();
    }
}
