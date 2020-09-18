package com.company;

public class Musketeer {
    // Member variables
    private String m_name;
    private int m_age;

    // Constructor
    public Musketeer(String name, int age){
        this.setName(name);
        this.m_age = age;
    }

    // Default age for all Musketeers
    public static final int S_DEFAULT_AGE = 35;

    // Second constructor
    public Musketeer(String name) {
        this.setName(name);
        this.m_age = S_DEFAULT_AGE;
    }

    // Getter and setter functions
    public void setAge(int age) {
        this.m_age = age;
    }

    public int getAge() {
        return this.m_age;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String m_name) {
        this.m_name = m_name;
    }
}
