package Lab;

import java.util.*;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> nameAndAge = new LinkedHashMap<>();
        Map<String,Integer> finalResult = new LinkedHashMap<>();
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input[] = scan.nextLine().split(", ");
            String name = input[0];
            int ageCurrentPerson = Integer.parseInt(input[1]);
            nameAndAge.put(name, ageCurrentPerson);
            names.add(name);
        }
        String condition = scan.nextLine(); // young,old
        int age = Integer.parseInt(scan.nextLine()); // age < age > age
        if (condition.equals("younger")) {
            List<String> youngPeople = namesToBeAddedToYoungPeopleMAp(nameAndAge, age, names);
            for (String name : youngPeople) {
                int yearsYoung = nameAndAge.get(name);
                finalResult.put(name, yearsYoung);
            }
        } else if (condition.equals("older")) {
            List<String> oldPeople = namesToBeAddedToOldPeopleMAp(nameAndAge, age, names);
            for (String name : oldPeople) {
                int yearsOld = nameAndAge.get(name);
                finalResult.put(name, yearsOld);
            }
        }
        String [] format = scan.nextLine().split(" ");
       // String command = format[0];// "name" "age" or "name age"
        if(format.length == 1){
            if(format[0].equals("name")) {
                finalResult.entrySet().forEach(e -> System.out.printf("%s%n", e.getKey()));
            }else if(format[0].equals("age")){
                finalResult.entrySet().forEach(e -> System.out.printf("%s%n", e.getValue()));
            }
        }else{
            finalResult.entrySet().forEach(e -> System.out.printf("%s - %d%n",e.getKey(),e.getValue()));
        }
    }

    private static List <String> namesToBeAddedToYoungPeopleMAp (Map<String, Integer> nameAndAge, int age, List<String> names) {
       List <String> sufficientAge = new ArrayList<>();
        for (String name : names) {
            int number = nameAndAge.get(name);
            if (number <= age) {
                sufficientAge.add(name);
            }
        }
        return sufficientAge;
    }
    private static List <String> namesToBeAddedToOldPeopleMAp (Map<String, Integer> nameAndAge, int age, List<String> names) {
        List <String> sufficientAge = new ArrayList<>();
        for (String name : names) {
            int number = nameAndAge.get(name);
            if (number >= age) {
                sufficientAge.add(name);
            }
        }
        return sufficientAge;
    }

}
