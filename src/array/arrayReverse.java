package array;

import java.util.Arrays;

public class arrayReverse {
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 35, 22, 15, 87};

        System.out.println("Array is:"+ Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array is:"+ Arrays.toString(arr));
    }
}
