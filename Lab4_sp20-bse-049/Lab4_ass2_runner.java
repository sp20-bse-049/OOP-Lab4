
package lab.pkg4;


public class Lab4_ass2_runner {
    public static void main (String[] args){
        Account a1 = new Account();
        a1.setBalance(5000);
        double n = a1.getBalance();
        a1.deposit(5000);
        a1.withdraw(500);
        System.out.println("\n");
        Account a2 = new Account(n);
        a2.deposit(2000);
        a2.withdraw(1000);
         
    }
    
}
