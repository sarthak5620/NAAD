package task0.String;

import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String number = sc.nextLine();
        System.out.println("enter a substring");
        String num = sc.nextLine();
        boolean result = number.contains(num);
        if (result) System.out.println("Yes the string contains substring");
        else System.out.println("No the given string does not contain substring");
    }
}
