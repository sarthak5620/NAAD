package task0.Decisionmaking;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int rev = 0 , rem = 0;
        while (n>0){
            rem = n % 10 ;
            rev = rev*10 + rem ;
            n = n / 10 ;
        }
        System.out.println("The reversed number is : " + rev);
    }
}
