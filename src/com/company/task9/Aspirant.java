package com.company.task9;

/**
 * Created by Ukrainian IT_SCHOOL on 20.10.2017.
 */
public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant() {
        scienceWork = "Исследование мира животных";
    }

    public Aspirant(String firstName, String lastName, String group, String scienceWork) {
        super(firstName, lastName, group);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public String toString() {
        return super.toString() + "Aspirant{" +
                "scienceWork='" + scienceWork + '\'' +
                '}';
    }
}
