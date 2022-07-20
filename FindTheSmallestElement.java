package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> findSmallestInt = list -> list.lastIndexOf(Collections.min(list));
//        Consumer<List<Integer>> printMinInt = list -> System.out.println(Collections.min(list));
        System.out.println(findSmallestInt.apply(input));

    }
}
