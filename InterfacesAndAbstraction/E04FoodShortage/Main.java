package InterfacesAndAbstraction.E04FoodShortage;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String[] dataArr = scan.nextLine().split("\\s+");
            String name = dataArr[0];
            int age = Integer.parseInt(dataArr[1]);
            Buyer buyer;

            if (dataArr.length == 4) {
                String id = dataArr[2];
                String birthDate = dataArr[3];
                buyer = new Citizen(name, age, id, birthDate);
            } else {
                String group = dataArr[2];
                buyer = new Rebel(name, age, group);
            }


                buyers.put(name, buyer);


        }

        String command = scan.nextLine();
        while (!"End".equals(command)) {
            Buyer currentBuyer = buyers.get(command);
            if (currentBuyer != null) {
                currentBuyer.buyFood();
            }
            command = scan.nextLine();
        }

        int sumOfFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(sumOfFood);

    }
}
