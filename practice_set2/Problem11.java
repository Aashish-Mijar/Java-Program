// import java.util.*;
class BankAccount{
    String accountHolderName;
     double accountNumber;
     double currentBalance;
     double currentLoan;

     BankAccount(){
     accountNumber=1000450056;
     System.out.println("Account Number is :"+accountNumber);
    
     }

    BankAccount(String accountHolderName, double currentBalance, double currentLoan){
        this.accountHolderName=accountHolderName;
        this.currentBalance=currentBalance;
        this.currentLoan=currentLoan;
     }

     void displayAccountInfo(){
        System.out.println("Account Holder's Name is :"+accountHolderName);
        System.out.println("Current balance :"+currentBalance);
        System.out.println("Current loan is :"+currentLoan);

     }

}
public class Problem11 {
    public static void main(String[] args) {
        // BankAccount ac1=new BankAccount("Aashish Mijar", 2000000, 0);
        BankAccount ac1=new BankAccount();
        ac1.displayAccountInfo();
    }
    
}
