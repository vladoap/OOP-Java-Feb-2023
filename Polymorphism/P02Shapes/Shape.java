package Polymorphism.P02Shapes;

public abstract class Shape {

    protected Double perimeter;
    protected Double area;



    abstract Double calculatePerimeter();
    abstract Double calculateArea();


    abstract Double getPerimeter();

    abstract Double getArea();
}
