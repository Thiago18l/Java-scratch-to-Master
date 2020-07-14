package Execute;

import BankAccount.BankAccount;

public class ProgramBank {
    public static void main(String[] args) {
        // Exercice:
        /**
         *  Question: is it better to invest $100 over 10 years at 5%
         * or to invest $100 over 20 years at 2.5% interest?
         */
        BankAccount john = new BankAccount("Jhon", 100.00);
        BankAccount ralph = new BankAccount("Ralph", 100.00);

        for (int years = 0; years < 10; years++) {
            john.deposit(john.getBalance() * 0.05);
        }
        for (int years = 0; years < 20; years++) {
            ralph.deposit(ralph.getBalance() * 0.025);
        }
        System.out.println("John invests $100 over 10 years at 5%.");
        System.out.println("After 10 years " + john.getAccount() + " has $" + john.getBalance());
        System.out.println("Ralph invests $100 over 20 years at 2.5%");
        System.out.println("After 20 years " + ralph.getAccount() + " has $" + ralph.getBalance());
    }
}
