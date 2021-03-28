package task0.Decisionmaking;

import java.util.Scanner;

public class LeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int a = sc.nextInt();
        if ( a % 4 == 0 && a % 100!= 0 || a % 400 == 0 && a % 100==0)
        {
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}
