package searchingSorting;

import java.util.Arrays;

public class bubbleSort {
    public static void sortBubble(int[] arr){
        for(int i = 0; i <arr.length - 1; i++)
            for (int j = 0; j <arr.length - i -1; j++)
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j +1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        sortBubble(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
