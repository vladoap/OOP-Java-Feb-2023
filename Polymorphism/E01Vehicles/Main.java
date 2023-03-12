package Polymorphism.E01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vehicle car = createVehicle(scan);
        Vehicle truck = createVehicle(scan);

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0) {
            String[] commandArr = scan.nextLine().split("\\s+");
            String command = commandArr[0];
            String vehicleType = commandArr[1];
            double distanceOrFuel = Double.parseDouble(commandArr[2]);

            switch (command) {
                case "Drive":
                    if (vehicleType.equals("Car")) {
                        car.drive(distanceOrFuel);
                    } else if (vehicleType.equals("Truck")){
                        truck.drive(distanceOrFuel);
                    }
                    break;
                case "Refuel":
                    if (vehicleType.equals("Car")) {
                        car.refuel(distanceOrFuel);
                    } else if (vehicleType.equals("Truck")){
                        truck.refuel(distanceOrFuel);
                    }
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }

    private static Vehicle createVehicle(Scanner scan) {
        String[] carInfo = scan.nextLine().split("\\s+");
        String vehicleType = carInfo[0];
        double fuelQuantity = Double.parseDouble(carInfo[1]);
        double fuelConsumption = Double.parseDouble(carInfo[2]);
        switch (vehicleType) {
            case "Car":
                return new Car(fuelQuantity, fuelConsumption);
            case "Truck":
                return new Truck(fuelQuantity, fuelConsumption);
        }

       return null;
    }
}
