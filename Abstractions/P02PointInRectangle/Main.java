package Abstractions.P02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] coordinates = readArray(scan);
        Point bottomLeftPoint = new Point(coordinates[0], coordinates[1]);
        Point topRightPoint = new Point(coordinates[2], coordinates[3]);
        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);

        int numberOfCommands = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfCommands; i++) {
            rectangle.isPointInside(scan);
        }
    }


    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
