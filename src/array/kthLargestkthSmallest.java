package array;

import java.util.Arrays;

public class kthLargestkthSmallest {
    public static int kthLargest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    public static int kthSmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k -1];
    }
    public static void main(String[] args) {
        int[] arr = {21, 35, 22, 15, 87};
        System.out.println("largest element is:"+kthLargest(arr,3));
        System.out.println("Smallest Element is:"+kthSmallest(arr,3));
    }
}
