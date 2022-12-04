package array;

public class minMax {
    public static int findMin(int[] arr){
        int min = arr[0];
        for( int i = 0; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for( int i = 0; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {21, 35, 22, 15, 87};
        System.out.println("Maximum among the element is:"+findMax(arr));
        System.out.println("Minimun among the element is:"+findMin(arr));
    }
}
