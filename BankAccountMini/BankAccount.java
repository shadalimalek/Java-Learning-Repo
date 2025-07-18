package BankAccountMini;

public class BankAccount {

    public String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawed ₹" + amount + " New balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}