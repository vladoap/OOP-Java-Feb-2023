package Polymorphism.P04WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String command = scan.nextLine();
        while (!command.equals("End")) {

            String[] dataAnimal = command.split("\\s+");
            Animal animal = createAnimal(dataAnimal);

            String[] foodData = scan.nextLine().split("\\s+");
            Food food = createFood(foodData);

            if (animal != null && food != null) {
                animal.makeSound();
                animal.eat(food);
                animals.add(animal);
            }

            command = scan.nextLine();
        }

        animals.forEach(System.out::println);
    }

    private static Food createFood(String[] foodData) {
        String type = foodData[0];
        Integer quantity = Integer.valueOf(foodData[1]);

        switch (type) {
            case "Vegetable":
                return new Vegetable(quantity);
            case "Meat":
                return new Meat(quantity);
        }
        return null;
    }

    private static Animal createAnimal(String[] data) {
        String type = data[0];
        String name = data[1];
        Double weight = Double.valueOf(data[2]);
        String livingRegion = data[3];
        switch (type) {
            case "Cat":
                String breed = data[4];
                return new Cat(type, name, weight, livingRegion, breed);
            case "Tiger":
                return new Tiger(type, name, weight, livingRegion);
            case "Mouse":
                return new Mouse(type, name, weight, livingRegion);
            case "Zebra":
                return new Zebra(type, name, weight, livingRegion);
        }
        return null;
    }
}
