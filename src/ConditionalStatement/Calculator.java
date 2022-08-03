package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int num1=input.nextInt();
		System.out.println("Please enter second number: ");
		int num2=input.nextInt();
		System.out.println("Please select an operator \n \t 1-(+) \n \t 2-(-) \n \t 3-(*) \n \t 4-(/) \n \t 5-(%)");
		int select=input.nextInt();
		
		switch (select) {
		
		case 1: 
			int result= num1+num2;
			System.out.println("Your result: "+ result);
		case 2: 
			result= num1-num2;
			System.out.println("Your result: "+result);
		case 3: 
			result=num1*num2;
			System.out.println("Your result: "+result);
		case 4:
			if(num1>num2 ) {
				result=num1/num2;
				System.out.println("Your result: "+result);
			}else {
				System.out.println("first number must be bigger");
			}
		case 5: 
			if(num1>num2) {
				result=num1%num2;
				System.out.println("Your result: "+result);
			}else {
				System.out.println("first number must be bigger");
			}
			
			input.close();
			
			
		}
	}

}
