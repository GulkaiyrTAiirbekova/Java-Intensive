package Week4.bank;

public class CheckingAccount {
    double balance;

    public CheckingAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;

    }
    public void withdraw(double amount){
        if(this.balance >=amount){
            this.balance -= amount;
        }
    }

    //Encapsulation,hide the balance from external accounts
    public double getBalance{
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
