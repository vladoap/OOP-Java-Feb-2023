package Abstractions.P04HotelReservation;

public enum DiscountType {
    VIP(0.2),
    SecondVisit(0.1),
    None(0.0);

    private double multiplier;
    DiscountType(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
