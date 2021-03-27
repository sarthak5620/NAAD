package task0;

import java.util.Scanner;
import java.math.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the co-efficient of x^2 i.e. a");
        double a = sc.nextDouble();

        System.out.println("Enter the co-efficient of x i.e. b");
        double b = sc.nextDouble();

        System.out.println("Enter the constant i.e. c");
        double c = sc.nextDouble();

        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double n1 = (-b + sqrt)/(2*a);
        double n2 = (-b - sqrt)/(2*a);

        System.out.println("The roots of the equation are " + n1 + " and " + n2);
    }
}
