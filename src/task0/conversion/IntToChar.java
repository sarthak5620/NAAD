package task0.conversion;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = sc.nextInt();
        String s =String.valueOf(a);
        System.out.println("After conversion the string is " + s);
    }
}
