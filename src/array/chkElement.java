package array;

public class chkElement {
    public static boolean isPresent(int[] arr, int k){
        for (int i = 0; i <= arr.length -1;i++){
            if (arr[i] == k)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {21, 35, 22, 15, 87};
        int k = 99;
        System.out.println("The given Element is present is the given array:"+isPresent(arr, k));
    }
}
