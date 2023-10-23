import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 5, 2, -1, 0, 9, 100};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
