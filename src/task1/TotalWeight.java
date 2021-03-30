package task1;

import java.util.Scanner;

public class TotalWeight {
    public static int totalWeight(String s , int[] weights ){
        int weight = 0 ;
        for (int i = 0; i <s.length() ; i++) {
            weight += weights[s.charAt(i) - 65];
        }
        return weight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        System.out.println("Enter value of weights ");
        int [] weights = new int[5];
        for (int i = 0; i < weights.length; i++) {
           weights[i] = sc.nextInt();
        }
        System.out.println("the total weight of given string is: " + totalWeight(string , weights));
    }
}
