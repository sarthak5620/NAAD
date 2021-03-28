package task0.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Enter a string");
        string = sc.nextLine();
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println( "The converted date is: " + date);
    }
}
