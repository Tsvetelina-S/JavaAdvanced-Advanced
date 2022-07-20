package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Predicate <String> uppercasePredicate = e -> Character.isUpperCase(e.charAt(0));
        List<String> uppercaseWords = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(uppercasePredicate)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());
        uppercaseWords.forEach(e -> System.out.println(e));

    }
}
