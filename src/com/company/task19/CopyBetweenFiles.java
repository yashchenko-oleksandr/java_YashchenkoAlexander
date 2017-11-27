package com.company.task19;

import java.io.*;

/**
 * Created by Ukrainian IT_SCHOOL on 27.11.2017.
 */
public class CopyBetweenFiles {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/company/task19/buffWriter.txt"));
             BufferedReader br = new BufferedReader(new FileReader("src/com/company/task19/buffWriter.txt"))) {
            //запись в файл
            String text = "Привет мир!";
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write(text);
            bufferedWriter.flush();

            //чтение построчно
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        char[] in = new char[50];
        int size = 0;
        File file = new File("fileWrite.txt");
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file);) {

            fw.write("Learn\nJava!\n");
            fw.flush();

            size = fr.read(in); // read the whole file!
            System.out.print(size + " "); // how many bytes read
            for (char c : in) {
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

    }
}
