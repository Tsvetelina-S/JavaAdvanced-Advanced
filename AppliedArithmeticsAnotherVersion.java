package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmeticsAnotherVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> add = listOfInt -> listOfInt.stream().map(e -> e += 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = listOfInt -> listOfInt.stream().map(e -> e *= 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = listOfInt -> listOfInt.stream().map(e -> e -= 1).collect(Collectors.toList());
        Consumer<Integer> print = e -> System.out.print(e + " ");
        String command = scan.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                   list =  add.apply(list);
                    break;
                case "multiply":
                   list =  multiply.apply(list);
                    break;
                case "subtract":
                   list = subtract.apply(list);
                    break;
                case "print":
                    list.stream().forEach(print);
                    System.out.println();
            }
            command = scan.nextLine();
        }

    }
}
