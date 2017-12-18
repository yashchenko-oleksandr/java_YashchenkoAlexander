package com.company.task20;

import java.io.Serializable;

/**
 * Created by Ukrainian IT_SCHOOL on 01.12.2017.
 */
public class Halter implements Serializable {
    private String type;

    public Halter() {
        type = "рысак";
    }

    public Halter(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Halter{" +
                "type='" + type + '\'' +
                '}';
    }
}
