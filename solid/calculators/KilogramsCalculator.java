package solid.calculators;

import solid.Product;

import java.util.List;

public class KilogramsCalculator extends Calculator {

    private List<Product> products;

    public KilogramsCalculator(List<Product> products) {
        super(products);

    }

    @Override
    public double sum(List<Product> products) {
        return products.stream().mapToDouble(Product::amountKG).sum();
    }

    @Override
    public double average(List<Product> products) {
        return products.stream().mapToDouble(Product::amountKG).average().getAsDouble();
    }
}
