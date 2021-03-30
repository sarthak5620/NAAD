package task0.String;

import java.util.Scanner;

public class SwitchInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numeric string");
        String number = sc.nextLine();
        int number1 = Integer.parseInt(number);
        switch (number1 ) {
            case 11 -> System.out.println(number1 + " present and Case1 is true.");
            case 10 -> System.out.println(number1 + " present and Case2 is true.");
            case 19 -> System.out.println(number1 + " present and Case3 is true.");
            default -> System.out.println(number1 + " not found on record.");
        }
    }
}
