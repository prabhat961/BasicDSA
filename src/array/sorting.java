package array;

import java.util.Arrays;

public class sorting {
    public static void sortArray(int[] arr){
        for(int i = 0; i < arr.length ;i++){
            for( int j = i; i < arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 35, 22, 15, 87};
        System.out.println("Array:"+ Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted Array:"+ Arrays.toString(arr));
    }
}
