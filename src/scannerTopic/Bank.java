package scannerTopic;

import java.util.Scanner;

public class Bank {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Deposit Amount: ");
        double initialDeposit = sc.nextDouble();
		
        System.out.print("Enter Account Number: ");
        int accnum = sc.nextInt();
		
        Bank c1 = new Bank();

        double finalBalance = c1.checkbalance(accnum, initialDeposit);
    }

    public static double deposit(double balance) {
        return balance;
    }

    public double checkbalance(int accNum, double depositAmount) {
        double avlBalance = 0.0;
		
        if (accNum == 29032) {

            avlBalance = deposit(depositAmount);
            System.out.println("Current balance: " + avlBalance);
        } else {
            System.out.println("Invalid account number.");
        }
		
        return avlBalance;
    }
}