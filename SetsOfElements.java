package Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input[] = scan.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Set<Integer> A = new LinkedHashSet<>();
        Set<Integer> B = new LinkedHashSet<>();
        for (int i = 1; i <= N; i++) {
            int number = Integer.parseInt(scan.nextLine());
            A.add(number);
        }
        for (int i = 1; i <= M; i++) {
            int number = Integer.parseInt(scan.nextLine());
            B.add(number);
        }
            for (int element : A) {
                if (B.contains(element)) {
                    System.out.print(element + " ");
            }
        }
    }
}
