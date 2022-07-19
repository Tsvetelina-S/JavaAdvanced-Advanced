package Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        Set<String> usernames =new LinkedHashSet<>();

        for (int i = 1; i <= number ; i++) {
            usernames.add(scan.nextLine());
        }
        for (String element: usernames) {
            System.out.println(element);
        }
    }
}
