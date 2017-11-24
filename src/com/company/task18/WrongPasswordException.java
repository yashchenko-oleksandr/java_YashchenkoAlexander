package com.company.task18;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{}";
    }
}
