import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static double[] selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println(Arrays.toString(selectionSort(list)));
        System.out.println(Arrays.toString(selectionSort(new double[] {})));
    }
}
