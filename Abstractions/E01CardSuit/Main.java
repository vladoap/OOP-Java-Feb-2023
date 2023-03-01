package Abstractions.E01CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Card Suits:");
        for (CardsType cardType : CardsType.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardType.ordinal(), cardType.name());
        }
    }
}
