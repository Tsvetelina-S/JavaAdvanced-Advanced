package StacksAndQueues_Lab;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] symbols  = scan.nextLine().split("\\s+");
        ArrayDeque <String> stack = new ArrayDeque<>();
        Collections.addAll(stack,symbols);
        int sum1 = 0;

        while(stack.size()>1){
            int num1 = Integer.parseInt(stack.pop());
            String symbol = stack.pop();
            int num2 = Integer.parseInt(stack.pop());
            if(symbol.equals("+")){
                sum1 = num1 + num2;
            }else if(symbol.equals("-")){
                sum1 = num1 - num2;
            }
            stack.push(String.valueOf(sum1));
        }
        System.out.println(stack.peek());
    }
}
