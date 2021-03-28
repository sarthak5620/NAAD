package task0.String;

import java.util.Scanner;

public class CheckNumericString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 ;
        System.out.println("Enter string");
        string1 = sc.nextLine();
        int flag = 1;

        try {
            Double num = Double.parseDouble(string1);
        } catch (NumberFormatException e) {
           flag = 0;
        }

        if(flag==1)
            System.out.println(string1 + " is a number");
        else
            System.out.println(string1 + " is not a number");
    }
}
