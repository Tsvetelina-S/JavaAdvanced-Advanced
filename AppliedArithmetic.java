package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //  String numbers [] = scan.nextLine().split(" ");
        List<String> numbers = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scan.nextLine();

        Function<String,Integer> parse = Integer::parseInt;
        Function<Integer,Integer> multiply = e -> e * 2;
        Function<Integer,Integer> subtract = e -> e - 1;
        Function<Integer,Integer> add = e -> e + 1;
        Consumer<Integer> print = e -> System.out.print(e + " ");

        while (!command.equals("end")){
            String [] commands = command.split(" ");
            String input = commands[0];
            switch (input){
                case "add":
                    numbers = numbers.stream().map(parse).map(add).map(Object::toString).collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream().map(parse).map(multiply).map(Object::toString).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(parse).map(subtract).map(Object::toString).collect(Collectors.toList());
                    break;
                case "print":
                    numbers.stream().map(parse).forEach(print);

            }
            command = scan.nextLine();
        }
    }
}
