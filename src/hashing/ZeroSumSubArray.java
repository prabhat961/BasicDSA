package hashing;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {
    public static boolean findSum(int[] arr, int n){
        Map<Integer, Boolean>map = new HashMap<>();
        int sum = 0;
        for( int i = 0; i < n; i++){
            sum += arr[i];
            if (sum == 0 || map.containsKey(sum))
                return true;
            map.put(sum, true);
        }
        return false;
    }
}
