package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Cat;
import partB.animals.Mammal;
import partB.food.Food;
import java.util.Date;

public class CatTest {
    public static void main(String[] args) {
        String catName = "Default";
        Date birthDate = new Date();
        int uniqueID = 0;
        Cat cat = new Cat(catName, birthDate, uniqueID);

        cat.setName("Whiskers");
        String returnedName = cat.getName();
        Assertions.assertEquals("Whiskers", returnedName);
        System.out.println("Tested .setName() method");

        cat.setBirthDate(new Date());
        Date returnedDate = cat.getBirthDate();
        Assertions.assertEquals(new Date(), returnedDate);
        System.out.println("Tested .setBirthDate() method");

        String sound = cat.speak();
        Assertions.assertEquals("meow!", sound);
        System.out.println("Tested .speak() method");

        Food catFood = new Food();
        cat.eat(catFood);
        int totalMealsEaten = cat.getNumberOfMealsEaten();
        Assertions.assertEquals(1, totalMealsEaten);
        System.out.println("Tested .eat() method");

        int returnedID = cat.getId();
        Assertions.assertEquals(uniqueID, returnedID);
        System.out.println("Tested .getId() method");

        System.out.println("Cat is an instance of Animal: " + (cat instanceof Animal));
        System.out.println("Cat is an instance of Mammal: " + (cat instanceof Mammal));
    }
}