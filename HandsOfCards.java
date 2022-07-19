package Exercises;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String,Integer> finalMap = new LinkedHashMap<>();
        Map<String,Set<String>> nameAndCards = new LinkedHashMap<>();
        while(!input.equals("JOKER")) {
            String[] playerAndPower = input.split(": ");
            String player = playerAndPower[0];
            String powerCards = playerAndPower[1];
            String[] cards = powerCards.split(", ");
            Set<String> info = new HashSet<>(Arrays.asList(cards));

            if(!finalMap.containsKey(player)){
                nameAndCards.put(player,info);
                int points = countPoints(info);
                finalMap.put(player,points);
            }else{
                Set<String> newSet = nameAndCards.get(player);
                newSet.addAll(info);
                nameAndCards.put(player,newSet);
                int points = countPoints(newSet);
                finalMap.put(player,points);
            }
            input = scan.nextLine();
        }

        for(Map.Entry<String, Integer> pair : finalMap.entrySet()){
            System.out.println(String.format("%s: %d",pair.getKey(),pair.getValue()));
        }

    }

    private static int countPoints(Set<String> info) {
        int points  = 0;
        for (String element : info) {
            char power = element.charAt(0);
            char type = element.charAt(1);
            int numberOfPower = 0;
            if (element.length()==3) {
                type = element.charAt(2);
                numberOfPower = 10;
            }else if(power == 'J') {
                numberOfPower = 11;
            }else if(power == 'Q') {
                numberOfPower = 12;
            }else if(power == 'K') {
                numberOfPower = 13;
            } else if(power == 'A'){
                numberOfPower = 14;
            }else{
                String powerString = String.valueOf(power);
                numberOfPower = Integer.parseInt(powerString);
            }
            int typeValue = 0;
                switch (type){
                    case 'S':
                        typeValue = 4;
                        break;
                    case 'H':
                        typeValue = 3;
                        break;
                    case 'D':
                        typeValue = 2;
                        break;
                    case 'C':
                        typeValue = 1;
                        break;
                }
            points += numberOfPower * typeValue;
            }
        return points;
    }
}
