package array;

import java.util.Arrays;

public class moveAllNegetive {
    // Method 1:
    public static void allNegetiveOneSide(int[] arr){
        Arrays.sort(arr);
    }
   //Method 2:
   public static void moveElementsOneSide(int[] arr){
        int j = 0, temp;
        for (int i = 0; i <  arr.length;i++){
            if(arr[i] < 0){
                if (i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
   }

   // Method 3:
   public static void shiftall(int[] arr, int left,
                        int right) {
        while (left <= right) {
           if (arr[left] < 0 && arr[right] < 0)
               left++;
           else if (arr[left] > 0 && arr[right] < 0) {
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }
           else if (arr[left] > 0 && arr[right] > 0)
               right--;
           else {
               left++;
               right--;
           }
       }
   }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };
        System.out.println(Arrays.toString(arr));
        //allNegetiveOneSide(arr);
        //System.out.println(Arrays.toString(arr));
       //moveElementsOneSide(arr);
       //System.out.println(Arrays.toString(arr));
        shiftall(arr,0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
}
