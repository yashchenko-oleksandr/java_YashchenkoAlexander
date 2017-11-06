package com.company.task13;

public class NumericString {
    public static void main(String[] args) {
        numericString();
    }

    public static void numericString() {
        String s;
        int a = 3, b = 56;
        StringBuilder sb = new StringBuilder(10);

        s = sb.append("3").append("+").append("56").append("=").append(a + b).toString();
        sb.deleteCharAt(4);
        sb.insert(4, "равно");
        System.out.println(s);
        System.out.println(sb);
        sb.delete(0, sb.capacity());

        s = sb.append("3").append("-").append("56").append("=").append(a - b).toString();
        sb.deleteCharAt(4);
        System.out.println(s);
        replese(sb);
        sb.delete(0, sb.capacity());

        s = sb.append("3").append("*").append("56").append("=").append(a * b).toString();
        sb.deleteCharAt(4);
        System.out.println(s);
        replese(sb);
    }

    public static void replese(StringBuilder sb) {
        sb.replace(4, 5, "равно");
        System.out.println(sb);
    }
}
