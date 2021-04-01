package task2;

import java.util.Scanner;

public class WordGuessGame {
    public static void StartGame(String str){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                char randomChar = str.charAt(i);
                sb.append(randomChar);
            }
            else {
                    count++;
                    sb.append('_');
            }
        }
             int chances = count + 3;
        System.out.println(sb.toString());
        String updated = sb.toString();
        while (chances!=0){
            System.out.println("Chances :" + chances);
            char c;
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess: ");
            c = sc.next().charAt(0);

            int counter=0;
            for (int i = 0; i <updated.length() ; i++) {
                if (c==str.charAt(i)){
                    updated = updated.substring(0,i) + c + updated.substring(i+1);
                counter++;
                }
            }
            if (updated.equals(str)){
                System.out.println("YAY YOU WON!!");
                return ;
            }
            System.out.println("Character found " + counter + " times.");
            chances--;
        }
        System.out.println("YOU LOST THE GAME");
        }

    public static void main(String[] args) {
        System.out.println("Please enter a name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StartGame(str);
    }
}
