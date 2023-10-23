import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i);
            int element = scanner.nextInt();
            list[i] = element;
        }

        System.out.print("List before sorting: ");
        for (int i : list) {
            System.out.print(i + "\t");
        }

        BubbleSort.bubbleSortByStep(list);

        BubbleSort.bubbleSort(list);
        System.out.print("List after sorting: ");
        for (int i : list) {
            System.out.print(i + "\t");
        }


    }
}
