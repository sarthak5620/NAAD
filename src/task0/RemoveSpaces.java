package task0;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            str = str.replaceAll("\\s", "");
        }
        System.out.println("Output string is" + str);
    }
}
