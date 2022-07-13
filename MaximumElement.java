package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scan.nextLine());
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        while(numberOfCommands > 0){
            String command [] = scan.nextLine().split(" ");
            String firstCommand = command[0];
            switch (firstCommand){
                case "1":
                    int secondCommand = Integer.parseInt(command[1]);
                    stack.push(secondCommand);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                       int max = Integer.MIN_VALUE;
                        for (int element : stack){
                            if (element > max) {
                                max = element;
                            }
                        }
                        System.out.println(max);
                    break;
            }
            numberOfCommands--;
        }

    }
}
