package com.company.task17;

import com.company.task9.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class StudentCollection {
    public static void main(String[] args) {
        List<Student> array = new ArrayList<>();
        array.add(new Student("d", "sad", "12"));
        array.add(new Student());
        array.add(new Student("dsfsd", "dfsdf", "22"));

        for (Student st : array) {
            System.out.println(st);
        }

        SortedSet<Student> set = new TreeSet<>();
        set.add(new Student("fася", "", ""));
        set.add(new Student("андрей", "", ""));
        set.add(new Student("Петя", "", ""));

        for (Student st : set) {
            System.out.println(st);
        }
    }
}
