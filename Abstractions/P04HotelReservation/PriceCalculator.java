package Abstractions.P04HotelReservation;

public class PriceCalculator {


    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int days, String season, String discountType) {
       this.pricePerDay = pricePerDay;
       this.days = days;
       this.season = Season.valueOf(season);
       this.discountType = DiscountType.valueOf(discountType);
    }


    public void printTotalPrice() {
        double totalPrice = pricePerDay * days * season.getMultiplier() * (1 - discountType.getMultiplier());
        System.out.printf("%.2f", totalPrice);
    }
}
