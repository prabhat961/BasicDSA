package basicProgram;

public class Factorial {
    //Method 1:
    public static int findfactorial(int n){
        int fact = 1;
        for ( int i = 1; i <= n;i++){
            fact = fact * i;
        }
        return fact;
    }
    //Method 2:
    public static int findFact( int n ){
        if (n == 1)
            return 1;
        else
          return  n * findFact(n - 1);
    }

    public static void main(String[] args) {

    }

}
