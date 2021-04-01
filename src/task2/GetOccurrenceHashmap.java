package task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetOccurrenceHashmap {
    public static HashMap<Integer, Integer> getOccurrencesHashMap(String string){
        HashMap<Integer, Integer> hm = new HashMap<>();

        int last = -1;
        String[] array = string.split(";");

        int[] finalarray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            finalarray[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(finalarray);

        for (int next: finalarray) {
            if (next != last) {
                hm.put(next, 1);
            } else {
                hm.replace(next, hm.get(next) + 1);
            }
            last = next;
        }
        return hm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        HashMap<Integer, Integer> hm = getOccurrencesHashMap(string);
        System.out.println("The resulting string is");
        for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
