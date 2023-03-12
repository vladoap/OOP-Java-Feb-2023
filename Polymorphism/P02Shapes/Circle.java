package Polymorphism.P02Shapes;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    Double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    Double getPerimeter() {
        return calculatePerimeter();
    }

    @Override
    Double getArea() {
        return calculateArea();
    }

    public final Double getRadius() {
        return radius;
    }
}
