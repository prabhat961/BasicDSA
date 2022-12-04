package basicProgram;

public class primeNumber {
    public static boolean isPrime( int n){
        int temp = 0;
        for(int i = 2; i < n; i++){
            if (n%i == 0)
                temp++;
        }
        if (temp > 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("this number is prime:"+isPrime(7));
    }
}
