package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] massive = scan.nextLine().split(", ");
        // създаваме масив от входящата информация

        List<String> evenNumbers = Arrays.stream(massive).map(Integer::parseInt) // превръщаме String в int
                .filter(e -> e % 2 == 0)// позволяваме само на четните числа да продължат
                .map(Object::toString) // преврущаме ги отново в String
                .collect(Collectors.toList());// слагаме ги в списък и го създаваме "evenNumbers"

        System.out.println(String.join(", ",evenNumbers));

        evenNumbers = evenNumbers
                .stream()
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.toList());
        System.out.println(String.join(", ",evenNumbers));

    }
}
