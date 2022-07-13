package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        if(n == 0){
            System.out.println(0);
        }else {
            while (n != 0) {
                stack.push(n % 2);
                n /= 2;
            }
            while(!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }

    }
}
