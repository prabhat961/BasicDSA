//Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
//has the largest sum and return its sum and print the subarray.
package array;

import java.util.ArrayList;

public class kadnesAlgorithms {
    public static int maxSubArray(int[] nums, ArrayList< Integer > subarray) {
        int max_sum = Integer.MIN_VALUE;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum = sum + nums[k];
                if (sum > max_sum) {
                    subarray.clear();
                    max_sum = sum;
                    subarray.add(i);
                    subarray.add(j);
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        ArrayList < Integer > subarray = new ArrayList < > ();
        System.out.println("Maximum sum of the subarray is:"+maxSubArray(arr, subarray));
    }
}
