package task0.Decisionmaking;

import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println("Enter the exponent");
        int r = sc.nextInt();
        double power = Math.pow(n , r);
        System.out.println("The result is: " + power);
    }
}
