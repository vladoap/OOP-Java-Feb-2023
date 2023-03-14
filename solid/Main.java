package solid;

import solid.calculators.CalorieCalculator;
import solid.calculators.KilogramsCalculator;
import solid.products.drinks.Lemonade;
import solid.products.food.Chocolate;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Chocolate(100);
        Product product2 = new Lemonade(500);

        List<Product> products = List.of(product1, product2);

        Printer printer1 = new Printer(new CalorieCalculator(products));
        Printer printer2 = new Printer(new KilogramsCalculator(products));

        printer1.printSum(products);
        printer1.printAverage(products);
        printer2.printSum(products);
        printer2.printAverage(products);





    }
}
