package com.company.task17;

import java.util.HashSet;
import java.util.Set;

public class TwoSets {
    public static void main(String[] args) {
        Set<String> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new HashSet<>();
        hashSet1.add("Бета");
        hashSet1.add("Aльфa");
        hashSet1.add("Этa");

        hashSet2.add("Этa");
        hashSet2.add("Эпсилон");
        hashSet2.add("Oмeгa");

        printSets(intersect(hashSet1, hashSet2));
        union(hashSet1, hashSet2);
        System.out.println();
        printSets(hashSet1);
    }

    public static void union(Set<?> set1, Set<?> set2) {
        set1.addAll((Set) set2);
    }

    public static Set<Object> intersect(Set<?> set1, Set<?> set2) {
        Set<Object> set3 = new HashSet<>();
        for (Object set : set1) {
            if (set2.contains(set)) {
                set3.add(set);
            }
        }
        return set3;
    }

    public static void printSets(Set<?> set) {
        for (Object s : set) {
            System.out.println(s);
        }
    }
}
