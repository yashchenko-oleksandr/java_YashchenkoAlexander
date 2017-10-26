package com.company.task9;

public class Recursion {

    public void recursion(int A, int B) {
        if (A < B) {
            System.out.print(A + " ");
            recursion(++A, B);
        } else if (A > B) {
            System.out.print(A + " ");
            recursion(--A, B);
        } else if (A == B) {
            System.out.print(A + " ");
            System.exit(0);
        }
        return;
    }
}
