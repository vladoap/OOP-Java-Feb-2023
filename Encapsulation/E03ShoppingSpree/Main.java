package Encapsulation.E03ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();


        String[] peopleData = scan.nextLine().split(";");
        for (String p : peopleData) {
            String name = p.split("=")[0];
            double money = Double.parseDouble(p.split("=")[1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String[] productsData = scan.nextLine().split(";");
        for (String p : productsData) {
            String name = p.split("=")[0];
            double cost = Double.parseDouble(p.split("=")[1]);
            try {
                Product product = new Product(name, cost);
                products.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scan.nextLine();
        while (!"END".equals(command)) {
            String[] dataArr = command.split("\\s+");
            String personName = dataArr[0];
            String productName = dataArr[1];

            try {
                Person currentPerson = people.get(personName);
                Product currentProduct = products.get(productName);
                currentPerson.buyProduct(currentProduct);
                System.out.println(personName + " bought " + productName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scan.nextLine();
        }

        people.values().forEach(System.out::println);


}
}
