package task0;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (n % 2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
