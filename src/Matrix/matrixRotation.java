package Matrix;

public class matrixRotation {
    static int n = 4;
    public static void rotate90Naive(int[][] mat){
        int[][] temp = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                temp[n - j - 1][i] = mat[i][j];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = temp[i][j];
    }
    static void swap(int mat[][], int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    public static void swap2(int low, int high, int i, int mat[][]) {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }
    public static void rotate90Efficient(int mat[][]) {
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                swap(mat, i, j);

        for(int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while(low < high) {
                swap2(low, high, i, mat);

                low++;
                high--;
            }
        }
    }


    public static void main(String[] args) {

    }
}
