package partB.animals;


import java.util.Date;

public class Cat extends Mammal {
    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "meow!";
    }
}
