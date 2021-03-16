
package lab.pkg4;


public class Account {
    private double balance;
    public Account(){
        balance = 0.00;
    }
    public Account(double b){
        balance = b;
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double b){
        System.out.println("your initial balance is = " + balance);
        balance = balance + b;
        System.out.println("After deposit "+ b +" your new balance is = " + balance);
    }
    public void withdraw(double a){
        balance = balance - a;
        System.out.println("After withdraw " + a +" your new balance is = " + balance);
    }
}
