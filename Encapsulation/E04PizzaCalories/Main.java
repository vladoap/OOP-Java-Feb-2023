package Encapsulation.E04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] pizzaData = scan.nextLine().split(" ");
        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);

        String[] doughData = scan.nextLine().split(" ");
        String flourType = doughData[1];
        String backingTechnique = doughData[2];
        double weight = Double.parseDouble(doughData[3]);
        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(flourType, backingTechnique, weight);
            pizza.setDough(dough);
            String command = scan.nextLine();
            while (!"END".equals(command)) {
                String[] toppingData = command.split(" ");
                String toppingType = toppingData[1];
                double toppingWeight = Double.parseDouble(toppingData[2]);
                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);

                command = scan.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
