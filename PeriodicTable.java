package Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 1; i <= num ; i++) {
            String[] input = scan.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(input));
        }
        for (String element: elements) {
            System.out.print(element + " ");
        }
    }
}
