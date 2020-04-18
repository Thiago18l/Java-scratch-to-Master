import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(1001, "Thiago", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "bob", 0.0, 200.00);
        Account account3 = new SavingsAccount(1004, "João", 0.0, 0.10);

        //DownCASTING

        BusinessAccount businessAccount1 = (BusinessAccount)account2;
        businessAccount1.loan(100.00);

        if (account3 instanceof  BusinessAccount){
            BusinessAccount businessAccount2 = (BusinessAccount)account3;
            businessAccount2.loan(200.00);
            System.out.println("Loan!");
        }
        if (account3 instanceof  SavingsAccount){
            SavingsAccount savingsAccount = (SavingsAccount)account3;
            savingsAccount.updateBalance();
            System.out.println("Update!");
        }

    }
}
