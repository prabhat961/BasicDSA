package hashing;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCoonsequtiveSubSequence {
    //Method 1:
    public static int LCSNaive(int[] arr, int n){
        Arrays.sort(arr);
        int count = 0, ans = 0;
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1])
                v.add(arr[i]);
        }
        for (int i = 0; i < v.size(); i++) {
            if (i > 0 && v.get(i) == v.get(i - 1) + 1)
                count++;
            else
                count = 1;
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;

        System.out.println(
                "Length of the Longest "
                        + "contiguous subsequence is "
                        + LCSNaive(arr, n));
    }
}
