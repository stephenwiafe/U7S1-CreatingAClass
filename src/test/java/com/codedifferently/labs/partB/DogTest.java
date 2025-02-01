package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Dog;
import partB.food.Food;
import partB.storage.DogHouse;
import java.util.Date;

public class DogTest {
    public static void main(String[] args) {
        String dogName = "Default";
        Date birthDate = new Date();
        int dogId = 0;
        Dog dog = new Dog(dogName, birthDate, dogId);

        dog.setName("Leo");
        String returnedName = dog.getName();
        Assertions.assertEquals("Leo", returnedName);
        System.out.println("Tested .setName()");

        dog.setBirthDate(new Date());
        Date returnedDate = dog.getBirthDate();
        Assertions.assertEquals(new Date(), returnedDate);
        System.out.println("Tested .setBirthDate()");

        String dogSound = dog.speak();
        Assertions.assertEquals("bark!", dogSound);
        System.out.println("Tested .speak()");

        Food dogFood = new Food();
        dog.eat(dogFood);
        int mealsEaten = dog.getNumberOfMealsEaten();
        Assertions.assertEquals(1, mealsEaten);
        System.out.println("Tested .eat()");

        int returnedId = dog.getId();
        Assertions.assertEquals(dogId, returnedId);
        System.out.println("Tested .getId()");

        System.out.println("Dog an instance of Animal: " + (dog instanceof partB.animals.Animal));
        System.out.println("Dog an instance of Mammal: " + (dog instanceof partB.animals.Mammal));

        DogHouse.add(dog);
        Dog retrievedDog = DogHouse.getDogById(dogId);
        Assertions.assertEquals(dog.getName(), retrievedDog.getName());
        Assertions.assertEquals(dog.getBirthDate(), retrievedDog.getBirthDate());
        Assertions.assertEquals(dog.getId(), retrievedDog.getId());
        System.out.println("Successfully tested .add() and .getDogById()");

        DogHouse.remove(dog);
        Dog removedDog = DogHouse.getDogById(dogId);
        Assertions.assertNull(removedDog);
        System.out.println("Successfully tested .remove(Dog)");

        DogHouse.add(dog);
        DogHouse.remove(dogId);
        Dog dogByIdAfterRemoval = DogHouse.getDogById(dogId);
        Assertions.assertNull(dogByIdAfterRemoval);
        System.out.println("Successfully tested .remove(Integer id)");

        Dog dog1 = new Dog("Bella", birthDate, 1);
        Dog dog2 = new Dog("Max", birthDate, 2);
        Dog dog3 = new Dog("Rex", birthDate, 3);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        int totDogs = DogHouse.getNumberOfDogs();
        Assertions.assertEquals(3, totDogs);
        System.out.println("Successfully tested .getNumberOfDogs()");
    }
}

