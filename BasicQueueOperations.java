package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int S = Integer.parseInt(scan.next());
        int X = Integer.parseInt(scan.next());
        ArrayDeque <Integer> queue = new ArrayDeque<>();

        while ( N > 0){
            int numbersToBeAdded = Integer.parseInt(scan.next());
            queue.add(numbersToBeAdded);
            N--;
        }
        while (S > 0){
            queue.poll();
            S--;
        }
        if(queue.isEmpty()){
            System.out.println(0);
        }else
        if(queue.contains(X)){
            System.out.println("true");
        }else{
            int min = Integer.MAX_VALUE;
            for (int element : queue) {
                if(element < min){
                    min = element;
                }
            }
            System.out.println(min);
        }

    }
}
