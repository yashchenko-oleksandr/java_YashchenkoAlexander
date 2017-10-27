package com.company.task11;

/**
 * Created by Ukrainian IT_SCHOOL on 27.10.2017.
 */
public class Magazine implements Printable {
    private String nameMagazine;

    public Magazine() {
        nameMagazine= "Журнал мурзилка";
    }

    public Magazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

    public String getNameMagazine() {
        return nameMagazine;
    }

    public void setNameMagazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "nameMagazine='" + nameMagazine + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Вывожу на печать журнал");
    }

    @Override
    public void printMagazines(Printable[] printable) {
        System.out.println(nameMagazine);
    }
}
