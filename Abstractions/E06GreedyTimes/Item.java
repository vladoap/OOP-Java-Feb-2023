package Abstractions.E06GreedyTimes;

public class Item {

    private ItemType type;
    private String name;
    private long amount;

    public Item(ItemType itemType, String itemName, long itemAmount) {
        type = itemType;
        name = itemName;
        amount = itemAmount;
    }

    public long getAmount() {
        return amount;
    }

    public ItemType getItemType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
