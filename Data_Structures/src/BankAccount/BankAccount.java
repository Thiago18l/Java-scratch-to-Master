package BankAccount;

public class BankAccount {
    protected String account;
    protected double balance;

    /**
     *
     * @param account
     * @param balance
     */
    public BankAccount(String account, double balance) {
        // Account is a string identifying the bank account
        //balance is the starting balance
        this.account = account;
        this.balance = balance;
    }

    /**
     *
     * @param other
     * @return true if this bank account is the same as other
     */
    public boolean equals(Object other) {
        // other is a valid  bank account
        BankAccount that = (BankAccount)other;
        // two accounts are the same if account numbers are the same
        return this.account.equals(that.account);
    }

    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw (double amount) {
        balance -= amount;
    }
}
