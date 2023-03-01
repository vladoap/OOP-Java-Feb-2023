package Abstractions.E05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner.nextLine());
        Field field = new Field(dimensions);
        Galaxy galaxy = new Galaxy(field);


        String command = scanner.nextLine();

        while (!command.equals("Let the Force be with you")) {
            int[] jediCoordinates = readArray(command);
            int[] evilCoordinates = readArray(scanner.nextLine());

            galaxy.moveEvil(evilCoordinates);
            galaxy.moveJedi(jediCoordinates);

            command = scanner.nextLine();
        }

        System.out.println(galaxy.getSum());


    }

    private static int[] readArray(String scanner) {
        return Arrays.stream(scanner.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
