package Matrix;

public class SearchInMatrix {
    //Naive:
    public static int searchElement(int[][] mat, int n, int x){
        for (int i = 0; i < n;i++){
            for (int j = 0; j < n; j++)
                if (mat[i][j] == x){
                    System.out.print("Element found at ("
                            + i + ", " + j
                            + ")\n");
                    return 1;
                }
        }
        System.out.print(" Element not found");
        return 0;
    }


    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        // Function call
        searchElement(mat, 4, 29);
    }
}
