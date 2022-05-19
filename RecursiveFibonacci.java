package StackAndQueues_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursiveFibonacci {

    public static long[] memory;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        memory = new long[num + 1];
        System.out.println(fib(num));
    }

    private static long fib(int num) {
        if(num <= 1){
            return 1;
        }else if(memory[num] != 0){
                return memory[num];
        }else{
            return memory[num] = fib(num -1 ) + fib(num -2 );
        }
    }
}
