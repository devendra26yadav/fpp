package Assignments.Assignment9.Lession12.problem2;

public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit can not be negative");
        } else if (amount > 0) {
            balance += amount;
            System.out.println("Successful deposit : "+amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {

        if (amount > balance) {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        } else if (amount > 0 && amount <= balance) {
            if (balance - amount < 100) {
                throw new AccountException("Low balance warning! Balance cannot go below $100.");
            }
            balance -= amount;
            System.out.println("Withdrawal Successful : "+amount);
            return true;
        } else if (amount <= 0) {
            throw new AccountException("Withdrawal can not be applied");
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
