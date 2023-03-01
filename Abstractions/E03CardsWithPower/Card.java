package Abstractions.E03CardsWithPower;

import java.util.Scanner;

public class Card {

    private RankPowers rankPower;
    private SuitPower suitPower;

    public Card(Scanner scan) {
        rankPower = RankPowers.valueOf(scan.nextLine());
        suitPower = SuitPower.valueOf(scan.nextLine());
    }

    public int cardPower() {
        return rankPower.getPower() + suitPower.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                rankPower.name(), suitPower.name(), cardPower());
    }
}
