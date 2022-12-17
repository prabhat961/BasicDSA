package Matrix;

public class ImplementationAndPrinting {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 4},{4, 8, 9},{6, 8, 4}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
