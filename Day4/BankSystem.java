
import java.util.ArrayList;
import java.util.List;

// Bank Class
class Bank {
   private String name;
   private List<Account> accounts; // Association with Accounts

   Bank(String name) {
       this.name = name;
       this.accounts = new ArrayList<>();
   }

   // Open a new account for a customer
   public void openAccount(Customer customer, double initialDeposit) {
       Account newAccount = new Account(this, customer, initialDeposit);
       accounts.add(newAccount);
       customer.addAccount(newAccount); // Associate account with customer
       System.out.println("Account opened for " + customer.getName() + " with balance: $" + initialDeposit);
   }

   public String getName() {
       return name;
   }
}

// Customer Class
class Customer {
   private String name;
   private List<Account> accounts; // A customer can have multiple accounts

   Customer(String name) {
       this.name = name;
       this.accounts = new ArrayList<>();
   }

   public void addAccount(Account account) {
       accounts.add(account);
   }

   public void viewBalance() {
       System.out.println("Accounts for " + name + ":");
       for (Account account : accounts) {
           System.out.println("Account ID: " + account.getId() + ", Balance: $" + account.getBalance());
       }
   }

   public String getName() {
       return name;
   }
}

// Account Class
class Account {
   private static int idCounter = 1; // Unique ID for accounts
   private int id;
   private Bank bank; // Associated bank
   private Customer customer; // Associated customer
   private double balance;

   Account(Bank bank, Customer customer, double initialDeposit) {
       this.id = idCounter++;
       this.bank = bank;
       this.customer = customer;
       this.balance = initialDeposit;
   }

   public int getId() {
       return id;
   }

   public double getBalance() {
       return balance;
   }
}

// Main Class
public class BankSystem {
   public static void main(String[] args) {
       // Create a bank
       Bank bank = new Bank("State Bank of India");

       // Create customers
       Customer customer1 = new Customer("Ishan Tiwari");
       Customer customer2 = new Customer("Om Yadav");

       // Open accounts for customers
       bank.openAccount(customer1, 1000.0);
       bank.openAccount(customer2, 500.0);
       bank.openAccount(customer1, 200.0);

       // View balances for customers
       customer1.viewBalance();
       customer2.viewBalance();
   }
}

