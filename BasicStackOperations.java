package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N = Integer.parseInt(scan.next()); // number to be added
        int S = Integer.parseInt(scan.next()); //number of el to be popped
        int X = Integer.parseInt(scan.next()); // is it in the stack
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        while(N > 0){
            int num = Integer.parseInt(scan.next());
            stack.push(num);
            N--;
        }
        while(S > 0){
            stack.pop();
            S--;
        }
        if(stack.contains(X)) {
            System.out.println("true");
        }else{
            int min = Integer.MAX_VALUE;
            if(stack.isEmpty()){
                System.out.println(0);
            }else {
                for (int number : stack) {
                    if (number < min) {
                        min = number;
                    }
                }
                System.out.println(min);
            }
        }
    }
}
