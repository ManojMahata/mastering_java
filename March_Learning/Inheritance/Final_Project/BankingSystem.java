import java.util.Scanner;

class Account {
    // attributes
    protected double balance;
    void deposite(double amount){
        if ( amount > 0 )
            this.balance += amount;

        System.out.println("Deposited: " + amount + "\nCurrent Balance: " + balance);
    }

} // Account || Parent class closed

class SavingAccount extends Account{
    void showBalance(){
        System.out.println("Saving Balance: " + balance);
    }
} // SavingAccount class closed

class CurrentAccoutn extends SavingAccount{
    protected double withdraw;
    void withdraw(double amount){
        if (amount > 0 && amount <= balance)
            balance -= amount;

        else
            System.out.println("Invalid withdrawal amount: " + amount);

        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

public class BankingSystem{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        CurrentAccoutn c1 = new CurrentAccoutn();

        System.out.print("\nEnter Deposite Amount: ");
        double amount = scan.nextDouble();

        System.out.print("\nEnter withdraw Amount: ");
        double withdraw = scan.nextDouble();

        c1.deposite(amount);
        c1.showBalance();
        c1.withdraw(withdraw);

        scan.close();

    }
}
