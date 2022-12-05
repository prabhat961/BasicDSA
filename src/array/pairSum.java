package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class pairSum {
    //Method 1:Naive
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i,j};
                }
            }
        }
        return new int[] {};
    }
    // Method 2: Sorting
    public static int[] pairSumsorting(int[] arr, int target){
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length - 1;
        while(lo < hi){
            if (arr[lo] + arr[hi] == target){
                return new int[] {arr[lo], arr[hi]};
            } else if (arr[lo] + arr[hi] < target) {
               lo++;
            }
            else {
                hi--;
            }
        }
        return new int[] {};
    }
    //Method 3: Hashing

    public static int[] pairSumhashing(int[] arr, int target){
        int[] res = new int[2];
        Map<Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(target - arr[i])){
                res[1] = i;
                res[0] = map.get(target - arr[i]);
                return res;
            }
            map.put(arr[i], i);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 9, 5, 6};
        int target = 12;
        int[] res = pairSumhashing(arr, target);
        System.out.println("Pairs are:"+res[0]+","+res[1]);
    }
}
