package task0;

import java.util.Scanner;

public class FrequencyOfACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a string: ");
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( c == str.charAt(i)) count++;
        }
        System.out.println("Frequency of " + c + " = " + count);
    }
}
