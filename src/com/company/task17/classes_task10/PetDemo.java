package com.company.task17.classes_task10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Барсик", new Cat("Барсик", "ул1"));
        pets.put("Кеша", new Parrot("Кеша","ул2"));
        pets.put("Васька", new Dog("Васька","ул3"));
        pets.put("Мастиф", new Parrot("Мастиф","ул4"));

        iterateKeys(pets);
        System.out.println(pets.get("Кеша"));
    }

    private static void iterateKeys(Map<String, Pet> pets) {
        Set<String> keys = pets.keySet();
        for (String key : keys){
            System.out.println(key);
        }
    }
}
