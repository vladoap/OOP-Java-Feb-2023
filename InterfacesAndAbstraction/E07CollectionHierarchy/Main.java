package InterfacesAndAbstraction.E07CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("\\s+");
        int counter = Integer.parseInt(scan.nextLine());

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

       performAddOperation(words, addCollection);
       performAddOperation(words, addRemoveCollection);
       performAddOperation(words, myList);

       performRemoveOperation(counter, addRemoveCollection);
       performRemoveOperation(counter, myList);

    }

    public static void performAddOperation(String[] words, Addable addable) {
        for (String singleWord : words) {
            System.out.print(addable.add(singleWord) + " ");
        }
        System.out.println();
    }

    public static void performRemoveOperation(int counter, AddRemovable addRemovable) {
        for (int i = 0; i < counter; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();

    }
}
