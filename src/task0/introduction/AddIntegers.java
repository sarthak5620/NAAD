package task0.introduction;
import java.util.Scanner;

public class AddIntegers {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        n1=sc.nextInt();
        System.out.println("enter second number:");
        n2=sc.nextInt();
        n3 = n1 + n2 ;
        System.out.println("the sum of entered numbers is:" + n3);
    }
}
