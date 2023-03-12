package Polymorphism.E01Vehicles;

public class Truck extends Vehicle {

    public static final double AC_CONSUMPTION_INCREASE = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_CONSUMPTION_INCREASE);
    }

    @Override
    public void refuel(double fuel) {
          fuelQuantity += fuel * 0.95;
    }
}
