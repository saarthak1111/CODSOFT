import java.util.*;
import java.util.Scanner;

public class ATM{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
		int pin = 1234;
		int balance = 10000;
		int attempts = 0;

		System.out.println("Welcome to ATM!");
		while(attempts < 3) {
			System.out.println("Enter your pin: ");
			int userpin = sc.nextInt();
			
			if(userpin == pin) {
				System.out.println("Access Granted!!");
				
			   boolean exit = false;
			   while(!exit) {
				   System.out.println("Select an option: ");
				   System.out.println("1. Check Bank Balance ");
				   System.out.println("2. Cash Withdrawl ");
				   System.out.println("3. Cash Deposit ");
				   System.out.println("4. Exit ");
				   
				   int choice = sc.nextInt();
				   
				   switch(choice) {
				   case 1:
					   System.out.println("You have choosed to check the bank balance");
					   System.out.println("Here is your bank balance: "+ balance);
					   break;
				   case 2:
					   System.out.println("You have choosed to withdraw cash");
					   System.out.println("Enter amount to withdraw: ");
					   int withdraw = sc.nextInt();
					   System.out.println("You have successfully withdrawn "+withdraw + " amount from your bank account");
					   balance -= withdraw;
					   break;
				   case 3:
					   System.out.println("You have choosed to deposit cash in your account");
					   System.out.println("Enter amount to deposit: ");
					   int deposit = sc.nextInt();
					   System.out.println("You have successfully deposited "+deposit + " amount in your bank account");
					   balance += deposit;
					   break;
				   case 4:
					   System.out.println("Thank you for using our ATM!");
					   exit = true;
					   break;
				   }
				   
			   }
			   break;
			}
			else {
				attempts++;
				System.out.println("Incorrect pin ....! You have "+(3-attempts) + " attempts");
			}
		}
		if(attempts==3) {
			System.out.println("Too many incorrect attempts! Account Locked..!");
		}
  }
}
