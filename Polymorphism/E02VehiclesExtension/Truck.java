package Polymorphism.E02VehiclesExtension;

public class Truck extends Vehicle {

    public static final double AC_CONSUMPTION_INCREASE = 1.6;
    public static final double FUEL_AFTER_DRIVER_DEDUCTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + AC_CONSUMPTION_INCREASE, tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (fuelQuantity + fuel > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
          fuelQuantity += fuel * FUEL_AFTER_DRIVER_DEDUCTION;
    }
}
