package com.codedifferently.labs.partB;
import org.junit.jupiter.api.Assertions;
import partB.storage.CatHouse;
import partB.animals.Cat;
import java.util.Date;

public class CatHouseTest {
    public static void main(String[] args) {
        String catName = "Leo";
        Date birthDate = new Date();
        Cat testCat = new Cat(catName, birthDate, 1);

        CatHouse.add(testCat);
        Cat retrievedCat = CatHouse.getCatById(1);
        Assertions.assertEquals(testCat.getName(), retrievedCat.getName());
        Assertions.assertEquals(testCat.getBirthDate(), retrievedCat.getBirthDate());
        Assertions.assertEquals(testCat.getId(), retrievedCat.getId());

        CatHouse.remove(testCat);
        retrievedCat = CatHouse.getCatById(1);
        Assertions.assertNull(retrievedCat);

        CatHouse.add(testCat);
        CatHouse.remove(1);
        retrievedCat = CatHouse.getCatById(1);
        Assertions.assertNull(retrievedCat);

        CatHouse.add(testCat);
        retrievedCat = CatHouse.getCatById(1);
        Assertions.assertEquals(testCat.getName(), retrievedCat.getName());
        Assertions.assertEquals(testCat.getBirthDate(), retrievedCat.getBirthDate());
        Assertions.assertEquals(testCat.getId(), retrievedCat.getId());
        CatHouse.remove(1);

        Cat firstCat = new Cat(catName, birthDate, 1);
        Cat secondCat = new Cat(catName, birthDate, 2);
        Cat thirdCat = new Cat(catName, birthDate, 3);

        CatHouse.add(firstCat);
        CatHouse.add(secondCat);
        CatHouse.add(thirdCat);

        int totCats = CatHouse.getNumberOfCats();
        Assertions.assertEquals(3, totCats);
    }
}