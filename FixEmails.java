package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String input = scan.nextLine();
        String sameAsInput = input;
        int count = 1;
        String temporaryShelter = "";
        Map<String,String> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            if (count % 2 != 0) {
                temporaryShelter = input;
            } else {
                String text = takeLastText(input);
                if (!text.equals("us") && !text.equals("uk") && !text.equals("com")) {
                    map.put(temporaryShelter, input);
                } else {
                    map.remove(temporaryShelter);
                }
            }
                count++;
                input = scan.nextLine();

        }
        for(Map.Entry<String, String> pair : map.entrySet()){
            System.out.println(String.format("%s -> %s",pair.getKey(),pair.getValue()));
        }

    }
    private static String takeLastText(String input) {
        String[] text1 = input.split("@");
        String text2 = text1[text1.length-1];
        String[] text3 = text2.split("\\.");
        return text3[text3.length-1].toLowerCase();
    }
}
