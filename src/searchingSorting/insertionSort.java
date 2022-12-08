package searchingSorting;

import java.util.Arrays;

public class insertionSort {
    public static void sortInsertion(int[] arr){
        for (int i = 1; i < arr.length;i++){
            int temp = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
         }
    }

    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9};
        sortInsertion(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}

