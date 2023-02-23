package Abstractions.P03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String command = scanner.nextLine();
        while (!command.equals("Exit")) {
            String[] input = command.split(" ");
            if (input[0].equals("Create")) {
                studentSystem.addStudent(input);
            } else if (input[0].equals("Show")) {
                studentSystem.printStudent(input);
            }
            command = scanner.nextLine();
        }
    }
}
