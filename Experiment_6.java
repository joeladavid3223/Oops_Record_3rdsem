package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

//Step 1: Interface for Transactions
interface Transaction {
 void deposit(double amount);
 void withdraw(double amount);
 void viewAccountDetails();
}

//Step 2: Abstract class for Account
abstract class Account {
 String custName;
 int accNo;
 double balance;

 public Account(String custName, int accNo, double balance) {
     this.custName = custName;
     this.accNo = accNo;
     this.balance = balance;
 }

 // Display basic account details
 public void showBasicDetails() {
     System.out.println("\n--- Account Details ---");
     System.out.println("Customer Name: " + custName);
     System.out.println("Account Number: " + accNo);
     System.out.println("Current Balance: ₹" + balance);
 }
}

//Step 3: Subclass implementing Transaction interface
class BankAccount extends Account implements Transaction {

 public BankAccount(String custName, int accNo, double balance) {
     super(custName, accNo, balance);
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("₹" + amount + " deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn successfully.");
     } else if (amount > balance) {
         System.out.println("Insufficient balance!");
     } else {
         System.out.println("Invalid withdrawal amount!");
     }
 }

 @Override
 public void viewAccountDetails() {
     showBasicDetails();
 }

 // Extra: Balance Enquiry
 public void checkBalance() {
     System.out.println("Your current balance is: ₹" + balance);
 }
}

//Step 4: Main class with menu-driven operations
public class Experiment_6 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Customer Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Account Number: ");
     int accNo = sc.nextInt();

     System.out.print("Enter Initial Balance: ");
     double bal = sc.nextDouble();

     BankAccount account = new BankAccount(name, accNo, bal);

     int choice;
     do {
         System.out.println("\n===== BANK MENU =====");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. View Account Details");
         System.out.println("4. Check Balance");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter amount to deposit: ");
                 double dep = sc.nextDouble();
                 account.deposit(dep);
                 break;
             case 2:
                 System.out.print("Enter amount to withdraw: ");
                 double wd = sc.nextDouble();
                 account.withdraw(wd);
                 break;
             case 3:
                 account.viewAccountDetails();
                 break;
             case 4:
                 account.checkBalance();
                 break;
             case 5:
                 System.out.println("Thank you for using our banking system!");
                 break;
             default:
                 System.out.println("Invalid choice! Please try again.");
         }
     } while (choice != 5);

     sc.close();
 }
}
