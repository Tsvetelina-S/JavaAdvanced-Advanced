package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortEvenWithBiFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        BiFunction<Integer,String,Integer> sum = (s,y) -> s + Integer.parseInt(y);
        Function<String,Integer> parseToInt = Integer::parseInt;
        Predicate<Integer> isEven = e -> e % 2 == 0;
        List<String> evenNumbers = Arrays.stream(input).map(parseToInt).filter(isEven).map(Object::toString).collect(Collectors.toList());
//        int sumEven = 0;
//        for (int i = 0; i < evenNumbers.size(); i++) {
//            sumEven = sum.apply(sumEven,evenNumbers.get(i));
//        }
//        System.out.println("Count = " + evenNumbers.size());
//        System.out.println("Sum = " + sumEven);
        System.out.println(String.join(", ",evenNumbers));
        evenNumbers = evenNumbers.stream().map(parseToInt).sorted().map(e-> e.toString()).collect(Collectors.toList());
        System.out.println(String.join(", ",evenNumbers));
    }
}
