package Inheritance.Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String animalType = scan.nextLine();
        while (!"Beast!".equals(animalType)) {
            String[] animalData = scan.nextLine().split("\\s+");
            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];

            try {

                switch (animalType) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        break;

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animalType = scan.nextLine();
        }
    }
}
