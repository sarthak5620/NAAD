package task1;

import java.util.Scanner;

public class DirectProportional {
    public static boolean DirectlyProportional(int[] x , int[] y){
            for (int i = 1; i < x.length; i++) {
                if (x[i] > x[i-1]) {
                    if(y[i] < y[i-1]) {
                        return false;
                    }
                }
                else if (x[i] < x[i-1]) {
                    if(y[i] > y[i-1]) {
                        return false;
                    }
                }
                else {
                    if (y[i] != y[i-1]) {
                        return false;
                    }
                }
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int number = sc.nextInt();

        System.out.print("Enter elements for x ");
        int[] x = new int[number];
        for (int i = 0; i < number; i++) {
            x[i] = sc.nextInt();
        }

        System.out.print("Enter elements for y ");
        int[] y = new int[number];
        for (int i = 0; i < number; i++) {
            y[i] = sc.nextInt();
        }

        System.out.println(" The given strings proportionality is" + DirectlyProportional(x, y));
    }
}
