package searchingSorting;

public class BinarySearch {
   public static int searchBinary(int arr[], int l, int r, int x) {
       if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return searchBinary(arr, l, mid - 1, x);
            return searchBinary(arr, mid + 1, r, x);
        }
       return -1;
    }
}
