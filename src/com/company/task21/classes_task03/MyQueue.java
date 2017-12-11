package com.company.task21.classes_task03;

import java.util.Queue;

public class MyQueue {
    private Queue<Integer> queue;

    public MyQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    public synchronized int get() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer detail = queue.poll();
        System.out.println("Пoлyчeнo: " + detail);
        //notify();
        return detail;
    }

    public synchronized void put(int n) {
        queue.add(n);
        System.out.println("Oтпpaвлeнo: " + n);
        notifyAll();
    }
}
