package task0.array;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of total numbers you want to find average");
        int n = sc.nextInt();
        float sum = 0 ;
        int [] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i] = sc.nextInt();
            sum  = sum + array[i];
        }
        double average = sum / n ;
        System.out.println("the average is: " + average);
    }
}
