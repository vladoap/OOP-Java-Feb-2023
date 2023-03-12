package Polymorphism.P02Shapes;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    Double calculatePerimeter() {
        return  2 * height + 2 * width;
    }

    @Override
    Double calculateArea() {
        return height * width;
    }

    @Override
    Double getPerimeter() {
        return calculatePerimeter();
    }

    @Override
    Double getArea() {
        return calculateArea();
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
