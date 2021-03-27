package task0.introduction;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        int k;
        System.out.println("Numbers before swapping are " + a + " and " + b);
        k=a;
        a=b;
        b=k;
        System.out.println("Numbers after swapping are " + a + " and " + b);
}
}
