package Encapsulation.E01ClassBox;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        ensurePositiveValue(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        ensurePositiveValue(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        ensurePositiveValue(height, "Height");
        this.height = height;
    }

    private void ensurePositiveValue(double value, String prefix) {
        if (value <= 0) {
            String message = String.format("%s cannot be zero or negative.", prefix);
            throw new IllegalArgumentException(message);
        }
    }

    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume () {
        return length * width * height;
    }
}
