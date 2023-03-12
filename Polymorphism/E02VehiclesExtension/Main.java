package Polymorphism.E02VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        Vehicle car = vehicles.put("Car", createVehicle(scan));
        Vehicle truck = vehicles.put("Truck", createVehicle(scan));
        Vehicle bus = vehicles.put("Bus", createVehicle(scan));


        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0) {
            String[] commandArr = scan.nextLine().split("\\s+");
            String command = commandArr[0];
            String vehicleType = commandArr[1];
            double distanceOrFuel = Double.parseDouble(commandArr[2]);

            switch (command) {
                case "Drive":
                    System.out.println(vehicles.get(vehicleType).drive(distanceOrFuel));
                    break;
                case "Refuel":
                    try {
                        vehicles.get(vehicleType).refuel(distanceOrFuel);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "DriveEmpty":
                    Bus busEmpty = (Bus) vehicles.get(vehicleType);
                    System.out.println(busEmpty.driveEmpty(distanceOrFuel));
                    break;
            }
        }

        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle createVehicle(Scanner scan) {
        String[] carInfo = scan.nextLine().split("\\s+");
        String vehicleType = carInfo[0];
        double fuelQuantity = Double.parseDouble(carInfo[1]);
        double fuelConsumption = Double.parseDouble(carInfo[2]);
        int fuelCapacity = Integer.parseInt(carInfo[3]);
        switch (vehicleType) {
            case "Car":
                return new Car(fuelQuantity, fuelConsumption, fuelCapacity);
            case "Truck":
                return new Truck(fuelQuantity, fuelConsumption, fuelCapacity);
            case "Bus":
                return new Bus(fuelQuantity, fuelConsumption, fuelCapacity);
            default:
                throw new IllegalArgumentException("Missing car");
        }

    }
}
