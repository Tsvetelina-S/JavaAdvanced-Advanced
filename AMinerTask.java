package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int count = 1;

        String resource = "";

        int quantity = 0;
        Map<String,Integer> map = new LinkedHashMap<>();
        while(!input.equals("stop")){
            if(count % 2 != 0){
                resource = input;
            }else {
                int conversion = Integer.parseInt(input);
                if (map.containsKey(resource)) {
                    quantity = map.get(resource);
                    map.put(resource, conversion + quantity);
                } else {
                    map.put(resource, conversion);
                }
            }
            count++;
            input = scan.nextLine();
        }
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(String.format("%s -> %d",pair.getKey(),pair.getValue()));
        }
        
    }
}
