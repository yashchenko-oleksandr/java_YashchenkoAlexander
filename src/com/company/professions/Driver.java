package com.company.professions;

import com.company.task8.Person;

public class Driver extends Person {
    private int experience;

    public Driver() {
        experience = 12;
    }

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + "Driver{" +
                "experience=" + experience +
                '}';
    }
}
