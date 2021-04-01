package task2;

import java.util.*;

public class GetList {
    public static List<Integer> getlist(String string){
        String[] str = string.split(";");
        List<Integer> list = new ArrayList<>();
        for (String s : str) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        List<Integer> list = getlist(string);
        System.out.println("The resulting string is: " + list);
    }
}
