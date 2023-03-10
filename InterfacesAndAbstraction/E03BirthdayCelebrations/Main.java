package InterfacesAndAbstraction.E03BirthdayCelebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        List<Birthable> birthables = new ArrayList<>();

        while (!"End".equals(command)) {
            String[] data = command.split("\\s+");
            String inputType = data[0];
            String nameOrModel = data[1];
            Birthable birthable = null;
            switch (inputType) {
                case "Citizen":
                    int age = Integer.parseInt(data[2]);
                    String id = data[3];
                    String birthDateCitizen = data[4];
                    birthable = new Citizen(nameOrModel, age, id, birthDateCitizen);
                    break;
                case "Pet":
                    String birthDatePet = data[2];
                    birthable = new Pet(nameOrModel, birthDatePet);
                    break;
                case "Robot":
                    break;
            }
            if (birthable != null) {
                birthables.add(birthable);
            }

            command = scan.nextLine();
        }
        String birthDate = scan.nextLine();

        birthables.stream().filter(e -> e.getBirthDate().endsWith(birthDate))
                .forEach(e -> System.out.println(e.getBirthDate()));
    }
}
