package Abstractions.P04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(data[0]);
        int days = Integer.parseInt(data[1]);
        String season = data[2];
        String discountType = data[3];

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, days, season, discountType);
        priceCalculator.printTotalPrice();
    }
}
