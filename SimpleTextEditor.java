package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder output = new StringBuilder();
        ArrayDeque <String> stackLastCommand = new ArrayDeque<>();
        String currentOutput = "";
        stackLastCommand.push(currentOutput);
        StringBuilder erase = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String [] input = scan.nextLine().split("\\s+");
            int firstCommand = Integer.parseInt(input[0]);
            currentOutput = stackLastCommand.peek();
            switch (firstCommand) {
                case 1:
                    String secondCommand = input[1];
                    currentOutput = currentOutput.concat(secondCommand);
                    stackLastCommand.push(currentOutput);
                    // System.out.println(currentOutput);

                    break;
                case 2:
                    int secondCommandInt = Integer.parseInt(input[1]);
                    if (!stackLastCommand.isEmpty()) {
                        erase = new StringBuilder(currentOutput);
                        currentOutput = erase.delete(currentOutput.length() - secondCommandInt, currentOutput.length()).toString();
                        stackLastCommand.push(currentOutput);
                        // System.out.println(currentOutput);
                    }
                    break;
                case 3:
                    int index = Integer.parseInt(input[1]);
                    if (!stackLastCommand.isEmpty()) {

                        char indexOfSecondCommand = currentOutput.charAt(index - 1);
                        System.out.println(indexOfSecondCommand);
                    }
                    break;
                case 4:
                    if (!stackLastCommand.isEmpty()) {
                        stackLastCommand.pop();
                    }
                    //String undo = stackLastCommand.peek();
                    //System.out.println(undo);
                    /*}else{
                        //System.out.println("");
                    }*/
                    break;
            }

        }

    }
}
