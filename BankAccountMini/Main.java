package BankAccountMini;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Shadali", 5000);
        ba1.deposit(1000);
        ba1.withdraw(3000);
        ba1.withdraw(4000);
    }
}