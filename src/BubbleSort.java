import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;

        while (needNextPass) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
        }
        return list;
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        int k = 0;

        while (needNextPass) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i+1]) {
                    System.out.println("\tSwap " + list[i] +" and " + list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }

            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
            }

            System.out.print("List after the " + k + " sort: ");
            for (int j : list) {
                System.out.print(j + "\t");
            }
            System.out.println();
            k++;
        }
    }


    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println(Arrays.toString(bubbleSort(list)));
    }
}
