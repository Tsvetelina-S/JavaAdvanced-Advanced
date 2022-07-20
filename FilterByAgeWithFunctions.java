package Lab;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAgeWithFunctions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> nameAndAge = new LinkedHashMap<>();
        Map<String, Integer> finalResult = new LinkedHashMap<>();
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input[] = scan.nextLine().split(", ");
           String name = input[0];
           int personAge = Integer.parseInt(input[1]);
            nameAndAge.put(name, personAge);
            names.add(name);
        }
        String condition = scan.nextLine(); // young,old
        int ageLimit = Integer.parseInt(scan.nextLine()); // age < age > age
        BiPredicate<Integer,Integer> filterPredicate;
        if (condition.equals("younger")) {
           filterPredicate = (personAge,age) -> personAge <= age; // връща true  или false
        } else {
            filterPredicate = (personAge,age) -> personAge >= age;
        }
        String format = scan.nextLine();
        Consumer<Map.Entry<String,Integer>> printConsumer;
        if(format.equals("age")){
            printConsumer = person -> System.out.println(person.getValue());
        }else if(format.equals("name")){
            printConsumer = person -> System.out.println(person.getKey());
        }else{
            printConsumer = person -> System.out.printf("%s - %d%n",person.getKey(),person.getValue());
        }
        nameAndAge.entrySet().stream().filter(person -> filterPredicate.test(person.getValue(),ageLimit)).forEach(printConsumer);

    }
}
