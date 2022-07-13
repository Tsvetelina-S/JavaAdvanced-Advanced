package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque <String> queue = new ArrayDeque<>();
        String command = scan.nextLine();
        while(!command.equals("print")){
            if(!command.equals("cancel")) {
                queue.offer(command);
            }
            if(command.equals("cancel")){
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            }
            command = scan.nextLine();
        }
        String [] array = queue.toArray(new String[0]);
        for (String element: array) {
            System.out.println(element);
        }

    }
}
