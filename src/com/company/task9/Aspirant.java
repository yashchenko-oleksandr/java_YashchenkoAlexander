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

    public void getScholarship(){
        System.out.println(this);
        System.out.println("Аспирант имеет стипендию 400");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aspirant aspirant = (Aspirant) o;

        return scienceWork != null ? scienceWork.equals(aspirant.scienceWork) : aspirant.scienceWork == null;
    }

    @Override
    public int hashCode() {
        return scienceWork != null ? scienceWork.hashCode() : 0;
    }


    public int compareTo(Aspirant o) {
        String anotherFirstName = o.getFirstName();
        return this.getFirstName().compareTo(anotherFirstName);
    }
}
