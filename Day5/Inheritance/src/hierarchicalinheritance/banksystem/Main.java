package hierarchicalinheritance.banksystem;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 10000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA54321", 5000.0, 2000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD67890", 25000.0, 5);

        System.out.println("Savings Account Details");
        savings.displayDetails();
        savings.displayAccountType();

        System.out.println("Checking Account Details");
        checking.displayDetails();
        checking.displayAccountType();

        System.out.println("Fixed Deposit Account Details");
        fixedDeposit.displayDetails();
        fixedDeposit.displayAccountType();
    }
}
