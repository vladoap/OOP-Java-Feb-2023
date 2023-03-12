package Polymorphism.E01Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double distance) {
        DecimalFormat df = new DecimalFormat("##.##");
        double neededFuel = distance * fuelConsumption;
        if (neededFuel <= fuelQuantity) {
            fuelQuantity -= neededFuel;
            System.out.printf(String.format("%s travelled %s km%n",
                    this.getClass().getSimpleName(), df.format(distance)));
        } else {
            System.out.printf(String.format("%s needs refueling%n",
                    this.getClass().getSimpleName()));
        }
    }
    public abstract void refuel(double fuel);

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity);
    }
}
