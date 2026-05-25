//Basic Banking System
//Balance,Deposit and Withdraw

//importing input field
import java.util.Scanner;

//Class for setup balance , add balance and withdraw balance
class SmartAccount {
    private double balance = 0.0;
    
    //deposit method 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }
    
    //withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Invalid Withdraw Amount");
        }
    }
    
    //getBalance() for showing balance
    public double getBalance() {
        return balance;
    }
}

//main class
public class Main {
    public static void main(String[] args) {
        
        //object creating
        Scanner input = new Scanner(System.in);
        SmartAccount myAccount = new SmartAccount();
        
        //while loops for infinite deposit and withdraw
        while (true) {
            System.out.println("i. Withdraw \nii. Deposit \niii. Exit");
            System.out.print("Choose a option (e.g., 'i' , 'ii' or 'iii' : ");
            String option = input.next();
            
            if (option.equals("iii")) {
                System.out.println("Thank You");
                break;
            }
            else if (option.equals("i")) {
                
                //while loop for safety input
                while (true) {
                    System.out.print("Enter Your Withdraw Amount : ");
                    String withdrawAmount = input.next();
                    try {
                        double withDrawAmount = Double.parseDouble(withdrawAmount);
                        myAccount.withdraw(withDrawAmount);
                        System.out.println("Account Balance : " + myAccount.getBalance());
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Please enter a number or your amount !");
                        continue;
                    }
                }

            }
            else if (option.equals("ii")) {
                
                //while loop for safety input
                while (true) {
                    System.out.print("Enter your deposit amount : ");
                    String depositAmount = input.next();
                    try {
                        double depositsAmount = Double.parseDouble(depositAmount);
                        myAccount.deposit(depositsAmount);
                        System.out.println("Account Balance : " + myAccount.getBalance());
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Please enter a number or amount");
                        continue;
                    }
                }
            }
            
            //if any option doesn't match
            else {
                System.out.println("Wrong Input !");
                continue;
            }
        }
    }
}
