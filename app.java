
import java.util.HashMap;
import java.util.Scanner;

//class representing a bank account
class Account {
    private String AccountNumber;
    private String AccountHolder;
    private double balance;

    //constructor initializes the account details
    public Account (String AccountNumber, String AccountHolder, double balance){
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    //getter for an account number 
    public String getAccountNUmber(){
        return AccountNumber;
    }
    
    //getter for account holder
    public String getAccountHolder(){
        return AccountHolder;
    }

    //getter for account balannce
    public double getBalnce(){
        return balance;
    }

    //method to deposit money into the account
     public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("deposit successfully! new balance: $" + balance);
        } else {
            System.err.println("invalid deposit amount!");
        }
        
    //method to withdraw money form account
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdraw successfully! new balance: $" + balance);
        } else {
            System.out.println("Issuffient funds or invalid amount!");
        }
    }
     }
}