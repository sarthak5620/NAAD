package task0;

import java.util.Scanner;

public class GreatestInThreeNumbers {
    public static void main(String[] args) {
        int n1 , n2 , n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        n1 = sc.nextInt();
        System.out.println("enter second number");
        n2 = sc.nextInt();
        System.out.println("enter third number");
        n3 = sc.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println("n1 is greatest");
        }
        else if (n2 > n1 && n2 >n3){
            System.out.println("n2 is greatest");
        }
        else{
            System.out.println("n3 is greatest");
        }
    }
}
