package array;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public static void swap012(int[] arr){
        int lo =0;
        int mid = 0;
        int hi = arr.length -1;
        while( mid <= hi) {
            int temp;
            switch(arr[mid]) {
                case 0:
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    ++lo;
                    ++mid;
                    break;
                case 1:
                    ++mid;
                    break;
                case 2:
                    temp = arr[hi];
                    arr[hi] = arr[mid];
                    arr[mid] = temp;
                    --hi;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 0, 1, 1, 2, 2, 0, 0, 0, 1, 0, 1};
        System.out.println("Sorted array without any algorithm is:");
        int n = arr.length;
        swap012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
