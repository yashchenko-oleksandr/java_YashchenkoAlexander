package com.company.task11.classes_task4;

public class Main {
    public static void main(String[] args) {
        Instruments[] instruments = new Instruments[3];

        instruments[0] = new Guitar(5);
        instruments[1] = new Drum(17);
        instruments[2]= new Trumpet(3);

        for (Instruments ins : instruments){
            ins.play();
        }
    }
}
