package task0.String;

public class OperatorDiffInString {
    public static void main(String[] args) {
        String one = new String("Program");
        String two = new String("Program");

        System.out.println("Check if two strings are equal");
        boolean result1 = (one == two);
        System.out.println("Using == operator: " + result1);

        boolean result2 = one.equals(two);
        System.out.println("Using equals(): " + result2);
    }
}
