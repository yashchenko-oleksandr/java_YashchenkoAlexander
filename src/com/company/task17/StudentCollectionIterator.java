package com.company.task17;

import com.company.task9.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ukrainian IT_SCHOOL on 20.11.2017.
 */
public class StudentCollectionIterator {
    public static void main(String[] args) {
        List<Student> array = new ArrayList<>();

        array.add(new Student("aaa", "aaaa", "21"));
        array.add(new Student("bbb", "bbbb", "21"));
        array.add(new Student("ccc", "cccc", "31"));

        System.out.println(getStudent(array));

    }

    public static List<Student> getStudent(List<Student> array) {
        List<Student> array1 = new ArrayList<>();
        Iterator<Student> iterator = array.iterator();
        while (iterator.hasNext()) {
            Student element = iterator.next();
            if (element.getGroup().equals("21")) {
                iterator.remove();
                array1.add(element);
            }
        }
        return array1;
    }
}
