package com.codedifferently.labs.partA.example01;

import partA.example01.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Gio";
        person1.age = 29;
        person1.address = "Philadelphia";

        System.out.println(person1.greet("Tariq"));
        System.out.println(person1.tellJoke());
    }
}
