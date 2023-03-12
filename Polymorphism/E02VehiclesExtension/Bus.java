package Polymorphism.E02VehiclesExtension;

public class Bus extends Vehicle {

    public static final double FUEL_AFTER_DRIVE_WITH_PEOPLE = 1.4;


    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + FUEL_AFTER_DRIVE_WITH_PEOPLE, tankCapacity);
    }

    public String driveEmpty(double distance) {
        super.fuelConsumption -= FUEL_AFTER_DRIVE_WITH_PEOPLE;
       return drive(distance);
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

