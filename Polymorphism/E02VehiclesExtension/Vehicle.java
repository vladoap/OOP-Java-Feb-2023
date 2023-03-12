package Polymorphism.E02VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected int tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        if (fuelQuantity > tankCapacity) {
            fuelQuantity = tankCapacity;
        }
    }

    public String drive(double distance) {
        DecimalFormat df = new DecimalFormat("##.##");
        double neededFuel = distance * fuelConsumption;
        if (neededFuel <= fuelQuantity) {
            fuelQuantity -= neededFuel;
            return String.format("%s travelled %s km",
                    this.getClass().getSimpleName(), df.format(distance));
        } else {
            return String.format("%s needs refueling",
                    this.getClass().getSimpleName());
        }
    }
    public abstract void refuel(double fuel);

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity);
    }
}
