package hashing;

import java.util.HashMap;

public class ktimesOccurance {
    //Method 1:
    public static int occurKTimes(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k) {
                return arr[i];
            }
        }
        return -1;
    }
    //Method 2:
    public static int countKOccurance(int[] arr, int k){
        HashMap<Integer, Integer> count_map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            if(count_map.get(arr[i])!=null){
                a = count_map.get(arr[i]);
            }
            count_map.put(arr[i], a+1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (count_map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 4, 3, 4, 8, 7 };
        int k = 2;
        System.out.print(occurKTimes(arr, k));
    }
}
