package com.company.task20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeHorce {
    public static void main(String[] args) {
        Halter halter = new Halter("sad");
        Horse horse = new Horse(halter);
        serialize(horse);
        Horse des = deserialization();
        System.out.println(des);
    }

    private static Horse deserialization() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testSer.txt"))) {
            return (Horse) ois.readObject();
        } catch (Exception e) {
            System.out.println();
            return new Horse();
        }
    }

    private static void serialize(Horse horse) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("testSer.txt"))) {
            os.writeObject(horse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
