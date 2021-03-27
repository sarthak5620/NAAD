package task0.introduction;

import java.util.Scanner;

public class EmptyOrNullString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        if (str == null || str.trim().isEmpty()) System.out.println("string is null or empty");
        else System.out.println("String is not null");
    }
}
