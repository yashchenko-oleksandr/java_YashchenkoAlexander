package com.company.task14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        regularExpression();
    }

    public static void regularExpression() {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8.";
        String words = "(\\w{3,4})\\s*\\d";
        Pattern pattern = Pattern.compile(words);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}