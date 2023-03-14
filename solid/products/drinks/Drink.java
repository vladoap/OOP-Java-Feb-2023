package solid.products.drinks;

import solid.Product;

public class Drink implements Product {

    private double milliliters;
    private double caloriesPer100;
    private double density;

    public Drink(double milliliters, double caloriesPer100, double density) {
        this.milliliters = milliliters;
        this.caloriesPer100 = caloriesPer100;
        this.density = density;
    }

    public double getGrams() {
        return milliliters * density;
    }
    @Override
    public double getCalories() {
        return (caloriesPer100 / 100.00) * getGrams();
    }

    @Override
    public double amountKG() {
        return getGrams() / 1000.00;
    }
}
