package com.company.task19;

import java.io.*;

/**
 * Created by Ukrainian IT_SCHOOL on 27.11.2017.
 */
public class CopyBetweenFiles {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/task19/copied_file.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter("src/com/company/task19/buffWriter.txt")))) {
            //чтение построчно
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
