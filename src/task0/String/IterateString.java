package task0.String;

import java.util.Scanner;

public class IterateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 ;
        System.out.println("Enter string");
        string1 = sc.nextLine();
        int n = string1.length();
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println(string1.charAt(i));
        }
    }
}
