package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque <String> URLs = new ArrayDeque<>();
        ArrayDeque <String> forward = new ArrayDeque<>();
        while (!input.equals("Home")){
            if(input.equals("back")){
                if(URLs.size()<=1){
                    System.out.println("no previous URLs");
                }else{
                   String lastURL = URLs.pop();
                    forward.push(lastURL);
                    System.out.println(URLs.peek());
                }
            }else if(input.equals("forward")){
                if(forward.isEmpty()){
                    System.out.println("no next URLs");
                }else{
                    String nextURL = forward.pop();
                    URLs.push(nextURL);
                    System.out.println(URLs.peek());
                }
            }else{
                URLs.push(input);
                System.out.println(URLs.peek());
                forward.clear();
            }
            input = scan.nextLine();
        }
    }
}
