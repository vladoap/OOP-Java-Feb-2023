package Polymorphism.E02VehiclesExtension;

public class Car extends Vehicle {

    public static final double AC_CONSUMPTION_INCREASE = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + AC_CONSUMPTION_INCREASE, tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (fuelQuantity + fuel > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
       fuelQuantity += fuel;
    }

}
