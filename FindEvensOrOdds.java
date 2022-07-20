package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] range = scan.nextLine().split(" ");
        int beginning = Integer.parseInt(range[0]);
        int ending = Integer.parseInt(range[1]);
        String command = scan.nextLine();
        Predicate<Integer> filterEvenOrOdd;
        if(command.equals("even")){
            filterEvenOrOdd = number -> number % 2 == 0;
        }else{
            filterEvenOrOdd = number -> number % 2 != 0;
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = beginning; i <= ending ; i++) {
            boolean isTrue = filterEvenOrOdd.test(i);
            if(isTrue) {
                numbers.add(i);
            }
        }
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
