package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        Collections.reverse(numbers);
        int n = Integer.parseInt(scan.nextLine());
        Predicate<Integer> checkIfNumberIsDivisibleByN = a -> a % n != 0;

       numbers.stream().filter(checkIfNumberIsDivisibleByN).forEach(e -> System.out.print(e + " ")); // може с removeIf
    }
}
//        nameAndAge.entrySet().stream().filter(person -> filterPredicate.test(person.getValue(),ageLimit)).forEach(printConsumer);