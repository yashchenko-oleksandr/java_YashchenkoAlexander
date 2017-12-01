package com.company.task20;

import java.io.Serializable;

public class Horse extends Animal implements Serializable{
    private Halter halter;

    public Horse() {
        halter = new Halter();
    }

    public Horse(Halter halter) {
        this.halter = halter;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "halter=" + halter +
                '}';
    }
}