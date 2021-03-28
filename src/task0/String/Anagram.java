package task0.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 , string2;
        System.out.println("Enter string1");
        string1 = sc.nextLine();
        System.out.println("Enter string2");
        string2 = sc.nextLine();
        if (string1.length() == string2.length()){
            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            boolean result = Arrays.equals(array1, array2);
            if(result) {
                System.out.println(string1 + " and " + string2 + " are anagram.");
            }
            else {
                System.out.println(string1 + " and " + string2 + " are not anagram.");
            }
        }
        else{
            System.out.println(string1 + " and " + string2 + " are not anagram.");
        }
    }
}
