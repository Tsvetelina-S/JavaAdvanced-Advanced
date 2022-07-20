package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] prices = scan.nextLine().split(", ");
        Function<String, Double> parse = (e -> Double.parseDouble(e));
        Function <Double, Double> addVAT = e -> 1.2 * e;
        Consumer<Double> result = e -> System.out.printf("%.2f%n",e);
        System.out.println("Prices with VAT:");
        Arrays.stream(prices)
                .map(parse)
                .map(addVAT)
                .forEach(result);
    }
}
