package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // Instantiating objects
        Person tom = new Person("Tom", "Sawyer");
        Person huck = new Person("Huck", "Finn");
        System.out.println(tom.getLastName());
        System.out.println(huck.getFirstName());

        tom.setLastName("Jones");
        huck.setFirstName("Huckleberry");

        System.out.println(tom.getLastName());
        System.out.println(huck.getFirstName());
    
        tom.incrementPersonCount();
        huck.incrementPersonCount();

    }
}
