package OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Poll> listOfPeople = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            Poll poll = new Poll();
            String [] people = scan.nextLine().split(" ");
            poll.setName(people[0]);
            poll.setAge(Integer.parseInt(people[1]));
            listOfPeople.add(poll);
        }
        listOfPeople = listOfPeople.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(e -> e.getName())).collect(Collectors.toList());
        for (Poll person : listOfPeople) {
            System.out.println(person.toString());
        }
    }
}
