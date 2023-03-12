package Polymorphism.E01Vehicles;

public class Car extends Vehicle {

    public static final double AC_CONSUMPTION_INCREASE = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_CONSUMPTION_INCREASE);
    }

    @Override
    public void refuel(double fuel) {

       fuelQuantity += fuel;
    }

}
