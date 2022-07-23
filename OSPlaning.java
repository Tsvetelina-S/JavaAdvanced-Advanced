import java.util.ArrayDeque;
import java.util.Scanner;

public class OSPlaning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] n = scan.nextLine().split(", ");
        String[] n2 = scan.nextLine().split("\\s+");
        int taskToBeKilled = Integer.parseInt(scan.nextLine());
        int winnerThread = 0;
        ArrayDeque<Integer> taskStack = new ArrayDeque<>(); // stack
        ArrayDeque<Integer> threadQueue = new ArrayDeque<>(); //queue

        for (String t : n) {
            taskStack.push(Integer.parseInt(t));
        }

        for (String t2 : n2) {
            threadQueue.offer(Integer.parseInt(t2));
        }


        while (true) {
            int peekTask = taskStack.peek();
            int peekThread = threadQueue.peek();
            if(peekTask == taskToBeKilled) {
                winnerThread = peekThread;
                break;
            }
            if (peekThread >= peekTask) {
                taskStack.pop();
                threadQueue.poll();
            } else {
                threadQueue.poll();
            }
        }

        System.out.printf("Thread with value %d killed task %d%n", winnerThread, taskToBeKilled);

        threadQueue.forEach(e -> System.out.print(e + " "));

    }
}
// Your job is to stop the work
// of the OS as soon as you get to this task, otherwise your OS will crash.
// The thread that gets first to this task, kills it.
//The OS works in the following way:

//⦁	It takes the first given thread value and the last given task value.

//⦁

//After you finish the needed task, print on a single line:
//"Thread with value {thread} killed task {taskToBeKilled}"
//Then print the remaining threads (including the one that killed the task) starting
// from the first on a single line, separated by a single space.