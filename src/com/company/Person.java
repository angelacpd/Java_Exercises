package com.company;

// Encapsulation
public class Person {

    // Member Variables
    private String firstName;
    private String lastName;

    // Static member variables
    private static int personCount = 0;

    // Constructor
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Member functions or methods
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Static member function
    public static void incrementPersonCount() { personCount++; }


}
