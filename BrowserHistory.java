package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque <String> stack = new ArrayDeque<>();
        String URL = scan.nextLine();
        String current = "";

        while(!URL.equals("Home")) {
            if (!URL.equals("back")) {
                stack.push(URL);
                System.out.println(stack.peek());
            }else{
                if(!stack.isEmpty()) {
                    current = stack.pop();
                    System.out.println(stack.peek());
                }else{
                    System.out.println("no previous URLs");
                        stack.push(current);
                }
            }
            URL = scan.nextLine();
        }
    }
}
