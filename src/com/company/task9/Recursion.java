package com.company.task9;

public class Recursion {

    int recursion(int A, int B) {
        if (A <= B) {
            System.out.print(A + " ");
            if (A == B) {
                System.exit(0);
            }
            recursion(++A, B);
        }
        if (A >= B) {
            System.out.print(A + " ");
            if (A == B) {
                System.exit(0);
            }
            recursion(--A, B);
        }
        return 0;
    }
}
