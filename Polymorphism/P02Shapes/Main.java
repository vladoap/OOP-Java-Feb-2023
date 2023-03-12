package Polymorphism.P02Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(3D, 5D);

        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
    }
}
