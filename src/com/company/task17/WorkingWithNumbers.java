package com.company.task17;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithNumbers {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4, 4, 5";
        Set<Character> characters = new HashSet<>();
        for (Character s : str.toCharArray()) {
            characters.add(s);
        }
        characters.remove(' ');
        characters.remove(',');

        System.out.print("Строка без повторений - ");
        for (Character c : characters) {
            System.out.print(c + " ");
        }
    }
}
