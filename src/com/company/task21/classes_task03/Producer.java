package com.company.task21.classes_task03;

public class Producer implements Runnable {
    private  MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            myQueue.put(i++);
        }
    }
}
