
package Abstractions.E06GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Bag myBag = new Bag(capacity, scanner);
        String[] treasure = scanner.nextLine().split("\\s+");

        var torba = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long zlato = 0;
        long kamuni = 0;
        long mangizi = 0;

        for (int i = 0; i < treasure.length; i += 2) {
            String itemName = treasure[i];
            long itemAmount = Long.parseLong(treasure[i + 1]);

            Item currentItem = createItem(itemName, itemAmount);
            myBag.put(currentItem);


        }

        System.out.println(myBag);


}

    private static Item createItem(String itemName, long itemAmount) {
        ItemType itemType;

        if (itemName.length() == 3) {
            itemType = ItemType.Cash;
        } else if (itemName.toLowerCase().endsWith("gem")) {
            itemType = ItemType.Gem;
        } else if (itemName.toLowerCase().equals("gold")) {
            itemType = ItemType.Gold;
        } else {
            return null;
        }

        return new Item(itemType, itemName, itemAmount);
    }
}