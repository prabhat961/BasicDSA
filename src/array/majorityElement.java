//Problem Statement:Given an array of N integers, write a program to return an element that occurs more than N/2 times
// in the given array. You may consider that such an element always exists in the array.
package array;

import java.util.HashMap;

public class majorityElement {
    //Method 1:
    public static void findMajority(int[] arr){
        int maxCount = 0 ;
        int index = -1;
        for (int i = 0; i < arr.length;i++){
            int count = 0;
            for( int j = 0; j < arr.length;j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > arr.length / 2)
            System.out.println(arr[index]);
        else
            System.out.println("No Majority Element");
    }
    //Method 2:
    public static void findMajorityHashing(int[] arr){
        HashMap<Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])){
                int count = map.get(arr[i]) + 1;
                if (count > arr.length /2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);
            }
            else
                map.put(arr[i],1);
        }
        System.out.println(" No Majority element");
            }


        public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
            findMajorityHashing(arr);
    }
}
