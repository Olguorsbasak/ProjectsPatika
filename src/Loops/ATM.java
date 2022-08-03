package week3.patikadev.java101.loops;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String userName;
		String password;
		int right=3;
		int balance=1500;
		int select=0;
		System.out.println("***Welcome ATM. Please enter your information***");
		while(right>=0) {
			System.out.println("User Name: ");
			userName=input.nextLine();
			System.out.println("Password: ");
			password=input.nextLine();
			
			if(userName.equalsIgnoreCase("user") && password.equalsIgnoreCase("123")) {
				System.out.println("Welcome, ATM Main Menu ");
				System.out.println("Please select your choice \n \t 1-Deposit Money \n \t 2-Withdraw Money \n \t 3-Balance inquiry  \n \t 4-Exit");
				select=input.nextInt();
				switch(select) {
				case 1: 
					System.out.println("Welcome Deposit Menu");
					System.out.println("Enter the number you want to deposit");
					int price=input.nextInt();
					balance+=price;
					System.out.println("Your new balance: "+balance);
					break;
				case 2: 
					System.out.println("Welcome Withdraw Menu");
					System.out.println("Enter the number you want to withdraw");
					price=input.nextInt();
					if(price>balance) {
						System.out.println("Insufficient balance");
					}else {
						balance-=price;
						System.out.println("Your new balance: "+balance);
					}
					break;
				case 3: 
					System.out.println("Welcome Balance Inquiry Menu");
					System.out.println("Your balance: "+balance);
					break;
				case 4:
					System.err.println("You logged out!");
					System.exit(0);
					break;
				default:
					System.out.println("Please check your information");
					break;
				}
			}else {
				right--;
				System.out.println("Wrong entry.Try again!");
				if(right==0) {
					System.out.println("You have tried too many times. Your account has been blocked.");
				}else {
					System.out.println("Your remaining right: "+right);
				}
				input.close();
			}
		}

	}

}
