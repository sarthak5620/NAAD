package task1;

import java.util.Scanner;

public class ModifyString {
    public static String StringModify(String string ,String replacements){
        char[] array = new char[10];
        int i = 0;
        while(i<replacements.length()){
            array[replacements.charAt(i)-48] = replacements.charAt(i+1);
          i+=2;
        }

        StringBuilder sb = new StringBuilder();
        for (i = 0; i < string.length(); i++) {
            char ch = array[string.charAt(i)-48];
            sb.append(ch);
        }
        return sb.toString() ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        System.out.println("Enter the replacing string");
        String replacements = sc.nextLine();
        System.out.println("The modified string is: " + StringModify(string, replacements));
    }
}
