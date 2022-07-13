package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque <Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < input.length() ; i++) {
            char symbol = input.charAt(i);
            //char current = stack.peek();
            if (symbol == '(') {
                stack.push(i);
            } else if (symbol == ')') {
                // char currentSymbol = stack.peek();
                int startIndex = stack.pop();
                // int endIndex = symbol + 1;
                String content = input.substring(startIndex, i + 1);
                System.out.println(content);
            }
        }
    }
}
