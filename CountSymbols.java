package Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<Character,Integer> elements = new TreeMap();
        int count = 0;
        for (char symbol : input.toCharArray()) {
            if (!elements.containsKey(symbol)) {
                elements.put(symbol, 1);
            } else {
                int numOfRepetition = elements.get(symbol);
                elements.put(symbol, numOfRepetition + 1);
            }
        }
        for(Map.Entry<Character, Integer> pair : elements.entrySet()){
            System.out.println(String.format("%s: %d time/s",pair.getKey(),pair.getValue()));
        }
    }
}
