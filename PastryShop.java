package ExamPrep3;

import java.util.*;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] n = scan.nextLine().split("\\s+");
        String[] n1 = scan.nextLine().split("\\s+");
        ArrayDeque<Integer> liquids = new ArrayDeque<>(); //1    25 50 50
        ArrayDeque<Integer> ingredients = new ArrayDeque<>(); //50 25 25    24
        for (String num: n) {
            liquids.offer(Integer.parseInt(num)); // queue
        }
        for (String num2: n1) {
            ingredients.push(Integer.parseInt(num2)); // stack
        }
        int countBiscuit = 0;
        int countCake = 0;
        int countPastry = 0;
        int countPie = 0;

        while(!liquids.isEmpty() && !ingredients.isEmpty()) {
            int peekLiq = liquids.peek();
            int peekIng = ingredients.peek();
            int mix = peekLiq + peekIng;
            if (mix == 25) {
                countBiscuit++;
                liquids.poll();
                ingredients.pop();
            } else if (mix == 50) {
                countCake++;
                liquids.poll();
                ingredients.pop();
            } else if (mix == 75) {
                countPastry++;
                liquids.poll();
                ingredients.pop();
            } else if (mix == 100) {
                countPie++;
                liquids.poll();
                ingredients.pop();
            }else{
                liquids.poll();
                ingredients.pop();

               peekIng += 3;
                //int addThreeToIngredient = ingredients.pop() + 3;
                ingredients.push(peekIng);
            }
        }
        Map<String,Integer> listOfFood = new LinkedHashMap<>();
        boolean isMissing = false;

        if(countBiscuit == 0) {
            isMissing = true;
        }
        listOfFood.put("Biscuit", countBiscuit);

        if(countCake == 0) {
            isMissing = true;
        }
        listOfFood.put("Cake", countCake);

        if(countPie == 0) {
            isMissing = true;
        }
        listOfFood.put("Pie", countPie);

        if(countPastry == 0) {
            isMissing = true;
        }
        listOfFood.put("Pastry", countPastry);

        if(!isMissing){
            System.out.println("Great! You succeeded in cooking all the food!");
        }else{
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }


        if(liquids.isEmpty()){
            System.out.println("Liquids left: none");
        }else{
            StringBuilder sb = new StringBuilder();
            for (Integer num: liquids) {
                sb.append(num).append(", ");
            }
            String word = sb.toString();
            word = word.substring(0,word.length()-2);
            System.out.println("Liquids left: " + word);
        }

        if(ingredients.isEmpty()){
            System.out.println("Ingredients left: none");
        }else{
            StringBuilder sb = new StringBuilder();
            for (Integer num: ingredients) {
               sb.append(num).append(", ");
            }
            String word = sb.toString();
           word = word.substring(0,word.length()-2);
            System.out.println("Ingredients left: " + word);
        }
        listOfFood.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}