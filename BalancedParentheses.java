package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque <Character> stack = new ArrayDeque<>();
        boolean isTrue = true;
        for (char element :
             input.toCharArray()) {
            if(element == '{' || element== '[' || element== '(' ){
                stack.push(element);
            }else if(element== '}' || element== ']' || element== ')') {
                if (stack.isEmpty()) {
                    isTrue = false;
                    break;
                } else {
                    char openingBracket = stack.pop();
                    if (openingBracket == '{' && element == '}') {
                        isTrue = true;
                    } else if (openingBracket == '[' && element == ']') {
                        isTrue = true;
                    } else if (openingBracket == '(' && element == ')') {
                        isTrue = true;
                    } else{
                        isTrue = false;
                        break;
                    }
                }
            }
        }
        if(isTrue){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}