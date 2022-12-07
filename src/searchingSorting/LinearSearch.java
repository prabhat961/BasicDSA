package searchingSorting;

public class LinearSearch {
    public static boolean searchLinear(int[] arr,int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x)
                return true;
        }
        return false;
    }
}
