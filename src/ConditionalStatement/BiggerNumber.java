package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		int num1=input.nextInt();
		System.out.println("Please enter your second number: ");
		int num2=input.nextInt();
		System.out.println("Please enter your third number: ");
		int num3=input.nextInt();
		
		if(num1<num2 && num1<num3) {
			if(num2<num3) {
				System.out.println("First number<second number<third number");
				
			}else {
				System.out.println("First number<third number<second number");
			}
		}else if(num2<num1 && num2<num3) {
				if(num1<num3) {
				System.out.println("Second number<first number<third number");
				
		}else {
			System.out.println("Second number<third number<first number");
		}
	}else if(num3<num1 &&num3< num2) {
		if(num3<num1) {
			System.out.println("Third number<first number<second number");
			
		}else {
			System.out.println("Third number<second number<first number");
		}
			
		}else {
			System.out.println("Please check your information");
		}
		input.close();
	}

}
