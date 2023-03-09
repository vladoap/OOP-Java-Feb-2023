package InterfacesAndAbstraction.P05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String command = scan.nextLine();

        while (!"End".equals(command)){
            String[] data = command.split("\\s+");
            Identifiable identifiable;
            if (data.length == 3) {
               String name = data[0];
               int age = Integer.parseInt(data[1]);
               String id = data[2];
               identifiable = new Citizen(name, age , id);
            } else {
                String model = data[0];
                String id = data[1];
                identifiable = new Robot(model, id);
            }
            identifiables.add(identifiable);

            command = scan.nextLine();
        }

        String suffix = scan.nextLine();

        identifiables.stream().filter(id -> id.getId().endsWith(suffix))
                .forEach(id -> System.out.println(id.getId()));
    }
}
