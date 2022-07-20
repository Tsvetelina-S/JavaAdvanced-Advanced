package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scan.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        //функцията трябва да приема лист и да връща цяло число - най- малкото
        //consumer приема лист и отпечатва цяло число
        Consumer<List<Integer>> printMinInt = list -> System.out.println(Collections.min(list));

        //Function<List<Integer>, Integer> getMin = list -> Collections.min(list);
       // System.out.println(getMin.apply(nums));
        printMinInt.accept(nums);
    }
}
