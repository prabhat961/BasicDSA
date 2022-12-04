package array;

public class countOccurance {
    public static int printOccurance(int[] arr, int k){
        int count = 0;
        for( int i = 0; i < arr.length; i ++){
            if (arr[i] == k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 1, 1, 1, 1, 1, 9,59};
        System.out.println("Count is:"+printOccurance(arr, 1));
    }
}
