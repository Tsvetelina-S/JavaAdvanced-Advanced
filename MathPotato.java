package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kids [] = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque <String> queue = new ArrayDeque<>();
        Collections.addAll(queue,kids);
        int count = 0;

        while(queue.size()>1) {
            count++;
            boolean isPrime = true;

            for (int i = 1; i < n; i++) { //2
                String currentKid = queue.poll();
                queue.offer(currentKid); // MARIA PETER GEORGE - maria george
            }

                if (count == 1) {
                    isPrime = false;
                }
                int countPrime = 0;

                for (int j = 1; j <= count; j++) {
                    if (count % j == 0) {
                        countPrime++;
                    }
                }
                if (countPrime == 2){
                    isPrime = true;
                }else{
                    isPrime = false;
                }
                if (isPrime) {
                   // String luckyKid = queue.poll();
                    System.out.println("Prime " + queue.peek());
                  //  queue.offer(luckyKid);
                } else {
                    //false
                    System.out.println("Removed " + queue.poll());
                }

        }
        System.out.println("Last is " + queue.peek());
    }
}
