package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        BiFunction<Integer, List<Integer>, Boolean> isDivisible = ((number, input) -> {
            for (int numberInList : input) {
                if (number % numberInList != 0) {
                    return false;
                }
            }
            return true;
        });
        for (int i =  1; i <=n ; i++) {
            if(isDivisible.apply(i,list)){
                System.out.print(i + " ");

            }
        }
    }
}
