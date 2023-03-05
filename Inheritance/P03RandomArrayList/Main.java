package Inheritance.P03RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> list = new RandomArrayList<>();
        list.add(2);
        list.add(3);
        list.add(100);
        list.add(555);

        System.out.println(list.getRandomElement());

    }
}
