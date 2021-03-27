package task0.introduction;

import java.util.Scanner;

public class MultiplyFLoatedNumbers {
    public static void main(String[] args) {
        float n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        n1=sc.nextFloat();
        System.out.println("enter second number:");
        n2=sc.nextFloat();
        n3 = n1 * n2 ;
        System.out.println("the result after multiplying entered numbers is:" + n3);
    }
}
