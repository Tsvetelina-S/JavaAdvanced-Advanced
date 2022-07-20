package Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());// length of the name
        String [] names = scan.nextLine().split("\\s+");
        Predicate<String> checkIfLengthIsCorrect = e -> e.length() <= n;

        Arrays.stream(names).filter(checkIfLengthIsCorrect).forEach(e -> System.out.println(e));
    }
}
