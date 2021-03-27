package task0.introduction;

import java.util.Scanner;
public class PrintEnteredNumber {
    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n1 = sc.nextInt();
        System.out.println("the number entered by user is:" + n1);
    }
}
