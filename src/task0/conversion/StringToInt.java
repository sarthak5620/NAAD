package task0.conversion;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        long n1 = Integer.parseInt(str);
        System.out.println("Int value of given String is" + n1);
    }
}
