package partB.storage;


import partB.animals.Dog;

public class DogHouse {
    private static AnimalWarehouse<Dog> dogHouse = new AnimalWarehouse<>();

    public static void add(Dog dog) {
        dogHouse.add(dog);
    }

    public static void remove(Integer id) {
        dogHouse.removeAnimalById(id);
    }

    public static void remove(Dog dog) {
        dogHouse.removeAnimal(dog);
    }

    public static Dog getDogById(Integer id) {
        return dogHouse.getAnimalById(id);
    }

    public static Integer getNumberOfDogs() {
        return dogHouse.getNumberOfAnimals();
    }

    public static void clear() {
        dogHouse.clear();
    }
}