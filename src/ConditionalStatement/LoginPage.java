package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;
public class LoginPage {

	public static void main(String[] args) {
		
		int password=1234;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your password: ");
		password=input.nextInt();
		if(password!=1234) {
			System.out.println("Your password is not created!Please try again");
			do {
				System.out.println("Please enter your password again");
				password=input.nextInt();
				//break;
			}
			while(password!=1234);
			System.out.println("Your password is created!");
		
			}
		input.close();
	
}
}
