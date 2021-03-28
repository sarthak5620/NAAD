package task0.Decisionmaking;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        int i = sc.next().charAt(0);
        if (i>=65 && i<=90 || i>=97 && i<=123){
            System.out.println("The entered character is an alphabet");
        }
        else {
            System.out.println("The entered character is not an alphabet");
        }
    }
}
