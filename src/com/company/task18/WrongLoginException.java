package com.company.task18;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException{}";
    }
}
