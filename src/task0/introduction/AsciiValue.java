package task0.introduction;
import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ASCII character:");
        int i = sc.next().charAt(0);
        System.out.println("the ascii value is " + i);
    }
}
