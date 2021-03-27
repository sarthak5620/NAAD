package task0;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("enter a divisor");
        int d = sc.nextInt();
        int r = n % d ;
        int q = n / d ;
        System.out.println("the quotient and remainder respectively are " + q + " and " + r);
    }
}
