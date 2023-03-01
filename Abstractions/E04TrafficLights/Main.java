package Abstractions.E04TrafficLights;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] trafficLights = scan.nextLine().split("\\s+");
        int changeTimes = Integer.parseInt(scan.nextLine());
        List<TrafficLight> trafficLightsList = new ArrayList<>();
        for (String singleLight : trafficLights) {
            Color color = Color.valueOf(singleLight);
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightsList.add(trafficLight);
        }

        for (int i = 0; i < changeTimes; i++) {
            for (TrafficLight trafficLight : trafficLightsList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }

    }
}
