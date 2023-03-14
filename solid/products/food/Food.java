package solid.products.food;

import solid.Product;

public class Food implements Product {

    private double grams;
    private double caloriesPer100;



    public Food(double grams, double caloriesPer100grams) {
        this.grams = grams;
        this.caloriesPer100 = caloriesPer100grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double getCalories() {
        return caloriesPer100 / 100 * grams;
    }

    @Override
    public double amountKG() {
        return grams / 1000.00;
    }
}
