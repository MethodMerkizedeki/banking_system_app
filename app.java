
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
        
    //method to withdraw money from account
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdraw successfully! new balance: $" + balance);
        } else {
            System.out.println("Issuffient funds or invalid amount!");
        }
    }
     }

     //main banking class
     private static HashMap<String, Account> account = new HashMap<>(); //store account in  a hashmap
     public static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args){
        while(true){
            //display the menu options
            System.out.println("banking system menu");
            System.out.println("create new account");
            System.out.println("deposit money");
            System.out.println("withdraw money");
            System.out.println("check balance");
            System.out.println("exit");
            System.out.println("choose an option");

            int choice = scanner.nextInt();
            scanner.nextLine(); //consume new line

            //handle user choices
            switch(choice){
                case 1: 
                      createAccount();
                      break;
                case 2:
                     depositMoney();
                     break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("existing banking system, goodbyee");
                    return;
                default:
                    System.out.println("invalid choice, try again");
            }
        }
     }

     //method to create a new account
     public static void createAccount(){
        System.out.println("enter account number");
        String accountNumber = scanner.nextLine();
        System.out.println("enter account name");
        String accountName = scanner.nextLine();
        System.out.println("enter initial deposit amount");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); //consume new line

        //create and store new account
        Account account = new Account(accountNumber, accountName, initialBalance);
        accounts.put(accountNumber, account);
        System.out.println("account created successfully");

        //method to deposit money into account
        public static void depositMoney(){
            System.out.println("enter account number");
            String accountNumber = scanner.nextLine();
            Account account = accounts.get(accountNumber);

            if( account != null){
                System.out.println("enter deposit amount");
                double amount = scanner.nextDouble();
                scanner.nextLine(); //consume new line
                account.deposit(amount);
            } else {
                System.out.println("account not found");
            }
        }

        //method to withdraw money from account
        private static void WithdrawMoney(){
            System.out.println("enter account number");
            String accountNumber = scanner.nextLine();
            Account account = accounts.get(accountNumber);
            
            if (account != null){
                System.out.println("enter amount to withdraw");
                double amount = scanner.nextDouble();
                scanner.nextLine(); //consume new line
                account.withdraw(amount);
            } else {
                System.out.println("account not found");
            }
        }

        //method to check account balance
        private static void checkBalance(){
            System.out.println("enter account number");
            String accountNumber = scanner.nextLine();
            Account account = accounts.get(accountNumber);

            if( account != null){
                System.out.println("account holder:" + account.getAccountHolder());
                System.out.printl("balance: $" + account.getBalance());
            } else {
                System.out.println("account not found");
            }
        }
     }
}