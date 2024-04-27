package work;

import java.util.Scanner;

class BankAccount {
    private  double balance;
    private String accountnumber;


    public   BankAccount(String accountnumber,double balance){
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    public boolean withdrawAmount(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }else {
            System.out.println("Insuffient balance");
            return false;
        }
    }
    public void deposite(double amount){
        System.out.println("deposite successfully");
        balance+=amount;
    }
    public void checkbalance(){
        System.out.println("your balance "+balance);
    }
}
class ATM{
    private String  addressOFAtm;
    private  String  idproof;
    private  BankAccount bankAccount;
    public ATM(String addressOFAtm,String idproof,BankAccount bankAccount){
        this.idproof=idproof;
        this.addressOFAtm=addressOFAtm;
        this.bankAccount=bankAccount;
    }
    public void withdrawAmount(double amount){
        if(bankAccount.withdrawAmount(amount)) {
            System.out.println("withdraw of" + amount + "successfully");
        }    }
    public  void deposite(double amount){
        bankAccount.deposite(amount);
    }
    public void checkbalance(){
        bankAccount.checkbalance();
    }
}

public class userofbank {
    public static void main(String[] args) {
        BankAccount  account=new BankAccount("PNBXXXXXX",10000);
        ATM atm=new ATM("barola","hjk90",account);
        Scanner scn=new Scanner(System.in);
        while(true){
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice=scn.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter the amount to withdraw ");
                    double withdrawammount=scn.nextDouble();
                    atm.withdrawAmount(withdrawammount);
                    break;
                case 2:
                    System.out.println("enter amount to deposite ");
                    double depositeammount=scn.nextDouble();
                    atm.deposite(depositeammount);
                    break;
                case 3:
                    atm.checkbalance();
                    break;
                case 4:
                    System.out.println("thank to visite my atm");
                    scn.close();
                    return;
                default:
                    System.out.println("your chpice is not valid");
            }

        }

    }
}
