package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //while (true) {
           int [] nums = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            ArrayDeque<Integer> integers = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            integers.push(nums[i]);

        }
        for (int number : integers) {
            System.out.print(number + " ");

        }


    }
}
