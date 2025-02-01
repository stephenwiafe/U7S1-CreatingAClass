package com.codedifferently.labs.partB;
import org.junit.jupiter.api.Assertions;
import partB.animals.Dog;
import partB.food.Food;
import partB.storage.DogHouse;
import java.util.Date;

public class DogHouseTest {
    public static void main(String[] args) {
        String dogName = "Ruby";
        Date dogBirthDate = new Date();
        int dogId = 1;
        Dog dog = new Dog(dogName, dogBirthDate, dogId);
        dog.setName("Olive");
        Assertions.assertEquals("Olive", dog.getName());

        Date newBirthDate = new Date();
        dog.setBirthDate(newBirthDate);
        Assertions.assertEquals(newBirthDate, dog.getBirthDate());

        String sound = dog.speak();
        Assertions.assertEquals("bark!", sound);

        Food dogFood = new Food();
        dog.eat(dogFood);
        int mealsEaten = dog.getNumberOfMealsEaten();
        Assertions.assertEquals(1, mealsEaten);

        int returnedId = dog.getId();
        Assertions.assertEquals(dogId, returnedId);

        System.out.println("Is dog an instance of Animal: " + (dog instanceof partB.animals.Animal));
        System.out.println("Is dog an instance of Mammal: " + (dog instanceof partB.animals.Mammal));

        DogHouse.add(dog);
        Dog getDog = DogHouse.getDogById(dogId);
        Assertions.assertEquals(dog.getName(), getDog.getName());
        Assertions.assertEquals(dog.getBirthDate(), getDog.getBirthDate());
        Assertions.assertEquals(dog.getId(), getDog.getId());

        DogHouse.remove(dog);
        getDog = DogHouse.getDogById(dogId);
        Assertions.assertNull(getDog);

        DogHouse.add(dog);
        DogHouse.remove(dogId);
        getDog = DogHouse.getDogById(dogId);
        Assertions.assertNull(getDog);

        Dog dog1 = new Dog("Dog1", dogBirthDate, 2);
        Dog dog2 = new Dog("Dog2", dogBirthDate, 3);
        Dog dog3 = new Dog("Dog3", dogBirthDate, 4);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        int totalDogs = DogHouse.getNumberOfDogs();
        Assertions.assertEquals(3, totalDogs);
    }
}