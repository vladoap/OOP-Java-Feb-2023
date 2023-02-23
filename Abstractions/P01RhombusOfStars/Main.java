package Abstractions.P01RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int numberOfStars = 1; numberOfStars <= n; numberOfStars++) {
                printRow(n - numberOfStars, numberOfStars);
        }

        for (int numberOfStars = n - 1; numberOfStars > 0; numberOfStars--) {
                printRow(n - numberOfStars, numberOfStars);
        }


    }

    private static void printRow(int countSpaces, int numberOfStars) {
        for (int spaces = 0; spaces < countSpaces; spaces++) {
            System.out.print(" ");
        }
        for (int stars = 0; stars < numberOfStars; stars++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
