package task0.String;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 , string2;
        System.out.println("Enter string1");
        string1 = sc.nextLine();
        System.out.println("Enter string2");
        string2 = sc.nextLine();
        if (string1.equals(string2)) System.out.println("strings are equal");
        else System.out.println("Strings are not equal");
    }
}
