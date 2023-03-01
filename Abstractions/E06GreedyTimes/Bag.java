package Abstractions.E06GreedyTimes;

import java.util.*;
import java.util.stream.Collectors;

public class Bag {

    private int capacity;
    private List<Item> items;


    public Bag(int capacity, Scanner scanner) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void put(Item currentItem) {
        if (weCanStore(currentItem)) {
            items.add(currentItem);
        }
    }

    private boolean weCanStore(Item currentItem) {
        if (capacity < getTotalAmount() + currentItem.getAmount()) {
            return false;
        }

        switch (currentItem.getItemType()) {
            case Gem:
                if (getAmount(ItemType.Gem) + currentItem.getAmount() > getAmount(ItemType.Gold)) {
                    return false;
                }
                break;
            case Cash:
                if (getAmount(ItemType.Cash) + currentItem.getAmount() > getAmount(ItemType.Gem)) {
                    return false;
                }
                break;
        }
        return true;
    }

    public long getTotalAmount() {
        return getAmount(ItemType.Gem) + getAmount(ItemType.Cash) + getAmount(ItemType.Gold);
    }

    public long getAmount(ItemType itemType) {
        return items.stream()
                .filter(e -> e.getItemType().equals(itemType))
                .mapToLong(e -> e.getAmount())
                .sum();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Set<ItemType> setItemType = items.stream().map(item -> item.getItemType()).collect(Collectors.toSet());

        if (setItemType.contains(ItemType.Gold)) {
            sb.append(String.format("<Gold> $%d", getAmount(ItemType.Gold))).append(System.lineSeparator())
                    .append(String.format("##Gold - %d", getAmount(ItemType.Gold))).append(System.lineSeparator());
        }
        if (setItemType.contains(ItemType.Gem)) {
            sb.append(String.format("<Gem> $%d", getAmount(ItemType.Gem))).append(System.lineSeparator());
            items.stream()
                    .filter(item -> item.getItemType().equals(ItemType.Gem))
                    .sorted((l, r) -> {
                        if (r.getName().equals(l.getName())) {
                            return (int) (l.getAmount() - r.getAmount());
                        }
                      return r.getName().compareTo(l.getName());
                    })
                    .forEach(item -> sb.append(String.format("##%s - %d", item.getName(), item.getAmount()))
                            .append(System.lineSeparator()));
        }

        if (setItemType.contains(ItemType.Cash)) {
            sb.append(String.format("<Cash> $%d", getAmount(ItemType.Cash))).append(System.lineSeparator());
            items.stream()
                    .filter(item -> item.getItemType().equals(ItemType.Cash))
                    .sorted((l, r) -> {
                        if (r.getName().equals(l.getName())) {
                            return (int) (l.getAmount() - r.getAmount());
                        }
                        return r.getName().compareTo(l.getName());
                    })
                    .forEach(item -> sb.append(String.format("##%s - %d", item.getName(), item.getAmount()))
                            .append(System.lineSeparator()));
        }

        return sb.toString();
    }
}
