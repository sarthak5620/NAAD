package task0.array;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatanateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array1 = new int[n];
        for (int i = 0; i <n ; i++) {
            array1[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int [] array2 = new int[a];
        for (int i = 0; i <a ; i++) {
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i <a ; i++) {
            array2[i] = sc.nextInt();
        }

        int length = array1.length + array2.length;
        int [] array3 = new int[length];
        int start = 0;
        for (int element : array1) {
            array3[start] = element;
            start++;
        }
        for (int element : array2) {
            array3[start] = element;
            start++;
        }
        System.out.println("The concatenated array is: " + Arrays.toString(array3));
    }
}
