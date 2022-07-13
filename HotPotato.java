package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] kids = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque <String> queue = new ArrayDeque<>();
        Collections.addAll(queue,kids);
        while(queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String kid = queue.poll();
                queue.offer(kid);
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
