package solid.calculators;

import solid.Product;

import java.util.List;

public abstract class Calculator {

    private List<Product> products;

    public Calculator(List<Product> products) {
        this.products = products;
    }

    public abstract double sum(List<Product> products);

    public abstract double average(List<Product> products);


}
