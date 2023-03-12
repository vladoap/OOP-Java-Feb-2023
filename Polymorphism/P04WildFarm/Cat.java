package Polymorphism.P04WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String  breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return String.format("Cat[%s, %s, %s, %s, %d]",
                getAnimalName(),
                breed,
                df.format(getAnimalWeight()),
                getLivingRegion(),
                getFoodEaten());
    }
}
