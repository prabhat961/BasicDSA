package basicProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome( int number){
        int rev = 0,rem;
        int temp =  number;
        while(number > 0){
            rem = number % 10;
            rev = (rev *10) + rem;
            number = number/10;
    }
        if (rev == temp)
        return true;
        else
            return false;
        }

    public static void main(String[] args) {
        System.out.println("Given number is pa;ondrom:"+isPalindrome(116));
    }
}