package Practice.Question_Bank;

import java.util.ArrayList;
import java.util.List;

// Bank class represents the bank itself
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public double getAccountBalance(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account.getBalance();
            }
        }
        return -1; // Account not found
    }

    public void transferMoney(int sourceAccountId, int destinationAccountId, double amount) {
        for (Account account : accounts) {
            if (account.getAccountId() == sourceAccountId) {
                account.withdraw(amount);
            }
            if (account.getAccountId() == destinationAccountId) {
                account.deposit(amount);
            }
        }
    }
}

// Account class represents a customer's account
class Account {
    private int accountId;
    private String accountHolderName;
    private double balance;

    public Account(int accountId, String accountHolderName) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initially balance is zero
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " deposited successfully. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        }
    }
}

// BankManagement class for demonstrating the bank system
public class BankManagement {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding accounts
        Account account1 = new Account(123, "Alice");
        Account account2 = new Account(456, "Bob");

        bank.addAccount(account1);
        bank.addAccount(account2);

        // Depositing and Withdrawing money
        account1.deposit(1000);
        account2.deposit(500);

        account1.withdraw(200);
        account2.withdraw(100);

        // Transferring money between accounts
        bank.transferMoney(123, 456, 300);



        // Checking account balances
        System.out.println("Account 123 balance: " + bank.getAccountBalance(123));
        System.out.println("Account 456 balance: " + bank.getAccountBalance(456));
    }
}
