package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Dog;
import partB.factories.AnimalFactory;
import partB.storage.DogHouse;

import java.util.Date;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        String name = "Cooper";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(name, date);
        Dog actualDog = new Dog(name, date, DogHouse.getNumberOfDogs());

        Assertions.assertEquals(dog.getName(), actualDog.getName());
        Assertions.assertEquals(dog.getBirthDate(), actualDog.getBirthDate());
        Assertions.assertEquals(dog.getId(), actualDog.getId());
    }
}
