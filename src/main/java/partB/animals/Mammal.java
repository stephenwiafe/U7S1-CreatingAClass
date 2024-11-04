package partB.animals;


import partB.animals.Animal;
import partB.food.Food;

import java.util.ArrayList;
import java.util.Date;

public abstract class Mammal extends Animal {
    private final Integer id;
    private ArrayList<Food> eatenMeals;
    private String name;
    private Date birthDate;

    public Mammal(String name, Date birthDate, Integer id) {
        this.name = name;
        this.birthDate = birthDate;
        this.eatenMeals = new ArrayList<>();
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public Integer getNumberOfMealsEaten() {
        return eatenMeals.size();
    }

    public void eat(Food food) {
        eatenMeals.add(food);
    }

    @Override
    public Integer getId() {
        return id;
    }
}
