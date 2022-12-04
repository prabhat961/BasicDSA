package basicProgram;

import java.util.Scanner;

public class LeapYear {
    public static void isLeep(int year){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}
