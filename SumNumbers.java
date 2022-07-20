package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        //Function<String,Integer> convert = Integer::parseInt;
        List<Integer> numbers = Arrays.stream(input).map(Integer::parseInt).collect(Collectors.toList());
        int sum = Arrays.stream(input).mapToInt(Integer::parseInt).sum();
        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);
    }
}
