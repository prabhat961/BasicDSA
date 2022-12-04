package basicProgram;

public class RaverseANumber {
    public static int numberReverse(int number){
        int rem, rev = 0;
        while(number > 0){
            rem = number % 10;
            rev = (rev * 10)+ rem;
            number = number/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int number = 9015;
        System.out.println("reverse of the given number is:"+numberReverse(number));
    }
}
