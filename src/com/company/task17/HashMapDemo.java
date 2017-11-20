package com.company.task17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ukrainian IT_SCHOOL on 20.11.2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 23));
        map.put("Box", new Toy("Box", 45));
        map.put("Car", new Toy("Car", 56));

        iterateEntries(map);

        iterateKeys(map);

        iterateValues(map);
    }

    private static void iterateValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy value : values) {
            System.out.println(value);
        }
    }

    private static void iterateKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    private static void iterateEntries(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> entries = map.entrySet();
        for (Map.Entry<String, Toy> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
