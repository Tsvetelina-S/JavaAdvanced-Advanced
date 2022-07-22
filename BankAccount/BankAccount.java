package BankAccount;

public class BankAccount {
    private static int id;
    private double balance;
    private static int bankAccountCount = 1;
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;

    BankAccount(){
        this.id = bankAccountCount++;
    }


    double getInterest (int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

     void deposit (double amount){
        this.balance += amount;

    }

    public static int getId() {
        return id;
    }
}
