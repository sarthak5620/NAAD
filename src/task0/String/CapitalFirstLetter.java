package task0.String;

import java.util.Scanner;

public class CapitalFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 ;
        System.out.println("Enter string");
        string1 = sc.nextLine();
        char[] charArray = string1.toCharArray();
        boolean flag = true;

        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(flag) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    flag = false;
                }
            }
            else {
                flag = true;
            }
        }
        string1 = String.valueOf(charArray);
        System.out.println("Message: " + string1);
    }
}
