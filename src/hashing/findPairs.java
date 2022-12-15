package hashing;

import java.util.HashMap;

//Problem Statement: FInd all the pairs in two unsorted given array with given Sum
public class findPairs {
    //Method1:
    public static void pairWithSUm(int[] arr1, int[] arr2, int sum){
        for( int i = 0; i < arr1.length;i++)
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] + arr2[j] == sum)
                    System.out.println(arr1[i] + " "
                            + arr2[j]);
    }

    //Method 2:
    public static void findPairs(int arr1[], int arr2[], int x) {
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr1.length; i++)
            s.put(arr1[i], 0);
        for (int j = 0; j < arr2.length; j++)
            if (s.containsKey(x - arr2[j]))
                System.out.println(x - arr2[j] + " " + arr2[j]);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 7, 5, 4 };
        int arr2[] = { 0, 7, 4, 3, 2, 1 };
        int x = 8;
        pairWithSUm(arr1, arr2, x);
    }
}
