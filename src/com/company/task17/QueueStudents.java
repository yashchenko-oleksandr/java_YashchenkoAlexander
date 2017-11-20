package com.company.task17;

import com.company.task9.Student;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by Ukrainian IT_SCHOOL on 20.11.2017.
 */
public class QueueStudents {
    public static void main(String[] args) {
        Deque<Student> deque = new ArrayDeque<>();
        deque.offer(new Student("aaa", "aaaa", "1"));
        deque.offer(new Student("bbb", "bbbb", "2"));
        deque.offer(new Student("ccc", "cccc", "3"));
        deque.poll();
        deque.poll();
        for (Student s : deque) {
            System.out.println(s);
        }
    }
}
