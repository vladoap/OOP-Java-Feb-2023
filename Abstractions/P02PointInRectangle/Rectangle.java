package Abstractions.P02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        return point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX()
                && point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
    }

    public void isPointInside(Scanner scan) {
        int[] currentPointCoordinates = readCoordinates(scan);
        System.out.println(this.contains(new Point(currentPointCoordinates[0], currentPointCoordinates[1])));
    }

    private int[] readCoordinates(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
