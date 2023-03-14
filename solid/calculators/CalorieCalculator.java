package solid.calculators;

import solid.Product;

import java.util.List;

public class CalorieCalculator extends Calculator{


    private List<Product> products;

    public CalorieCalculator(List<Product> products) {
        super(products);
    }



    @Override
    public double sum(List<Product> products) {
        return products.stream().mapToDouble(Product::getCalories).sum();
    }

    @Override
    public double average(List<Product> products) {
        return products.stream().mapToDouble(Product::getCalories).average().getAsDouble();
    }




}
