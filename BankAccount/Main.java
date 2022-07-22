package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String result = "";
            String[] command = input.split(" ");
            String firstCommand = command[0];
            switch (firstCommand) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();

                    break;
                case "Deposit":
                    int Id = Integer.parseInt(command[1]);
                    int amount = Integer.parseInt(command[2]);
                    break;
                case "SetInterest":
                    int interest = Integer.parseInt(command[1]);
                    break;
                case "GetInterest":
                    int ID = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    break;
            }
            input = scan.nextLine();
        }
    }
}
