package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,String> listOfPhoneNumbers = new LinkedHashMap<>();
        String input = scan.nextLine();
        while(!input.equals("search")){
            String information[] = input.split("-");
            String name = information[0];
            String number = information[1];
            listOfPhoneNumbers.put(name,number);
            input = scan.nextLine();
        }
        String nameToBeFound = scan.nextLine();
        while(!nameToBeFound.equals("stop")){
            if(listOfPhoneNumbers.containsKey(nameToBeFound)){
                String number = listOfPhoneNumbers.get(nameToBeFound);
                System.out.println(nameToBeFound + " -> " + number );
            }else{
                System.out.printf("Contact %s does not exist.%n",nameToBeFound);
            }

            nameToBeFound= scan.nextLine();
        }
    }
}
