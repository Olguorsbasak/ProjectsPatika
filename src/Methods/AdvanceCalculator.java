package week4.patikadev.java101.methods;
import java.util.Scanner;
public class AdvanceCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int select;
			System.out.println("****WELCOME ADVANCE CALCULATOR****");
		String menu= "1-Addition \n"
				+ "2-Subtraction \n"
				+ "3-Multiplication \n"
				+ "4-Division \n"
				+ "5-Exponential \n"
				+ "6-Factorial \n"
				+ "7-Mod \n"
				+ "8-Rectangular area and perimeter calculation \n"
				+ "9-Exit \n";
		do {
			System.out.println(menu);
			System.out.println("Please enter your operator");
			select=input.nextInt();
			switch(select) {
			case 1:
				addition();
				break;
			case 2:
				subtraction();
				break;
			case 3:
				multiplication();
				break;
			case 4:
				division();
				break;
			case 5:
				exponential();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8: 
				area();
				break;
			case 9:
				System.err.println("You logged out!");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong entry!");
				break;
			}
			
		}while(select !=0);
		input.close();
	}
	
			static void addition() {
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter 0 to exit");
		        int number, result = 0, i = 1;
		        while (true) {
		            System.out.println(i++ + ". number :");
		            number = input.nextInt();
		            if (number == 0) {
		                break;
		            }
		            result += number;
		        }
		        System.out.println("Result : " + result);
		        input.close();
			}
			static void subtraction() {
				Scanner input = new Scanner(System.in);
		        System.out.println("How many numbers will you enter:");
		        int counter = input.nextInt();
		        int number, result = 0;

		        for (int i = 1; i <= counter; i++) {
		            System.out.print(i + ". number :");
		            number = input.nextInt();
		            if (i == 1) {
		                result += number;
		                continue;
		            }
		            result -= number;
		        }

		        System.out.println("Result : " + result);
		        input.close();
			}
			static void multiplication() {
				 Scanner input = new Scanner(System.in);
				
			        int number, result = 1, i = 1;

			        while (true) {
			            System.out.println(i++ + ". number :");
			            number = input.nextInt();

			            if (number == 1) {
			                break;
			            }else if (number == 0) {
			                result = 0;
			                break;
			            }
			            result *= number;
			        }

			        System.out.println("Result : " + result);
			        input.close();
			}
			static void division() {
				Scanner input = new Scanner(System.in);
		        System.out.print("How many numbers will you enter: ");
		        int counter = input.nextInt();
		        double number, result = 0.0;

		        for (int i = 1; i <= counter; i++) {
		            System.out.print(i + ". number :");
		            number = input.nextDouble();
		            if (i != 1 && number == 0) {
		                System.out.println("You cannot enter a divisor by zero.");
		                continue;
		            }
		            if (i == 1) {
		                result = number;
		                continue;
		            }
		            result /= number;
		        }

		        System.out.println("Result : " + result);
		        input.close();
			}
			static void exponential() {
				Scanner input = new Scanner(System.in);
		        System.out.print("Please enter base value :");
		        int base = input.nextInt();
		        System.out.print("Please enter exponent value :");
		        int exponent = input.nextInt();
		        int result = 1;

		        for (int i = 1; i <= exponent; i++) {
		            result *= base;
		        }

		        System.out.println("Result : " + result);
		        input.close();
			}
			static void factorial() {
				 Scanner input = new Scanner(System.in);
			        System.out.print("Please enter a number :");
			        int n = input.nextInt();
			        int result = 1;

			        for (int i = 1; i <= n; i++) {
			            result *= i;
			        }

			        System.out.println("Result : " + result);
			        input.close();
			}
			static void mod() {
				Scanner input=new Scanner(System.in);
				System.out.println("Please enter a number: ");
				int num=input.nextInt();
				int result=num%10;
				
				System.out.println("Result: "+result);
				input.close();
			}
			static void area () {
				Scanner input=new Scanner(System.in);
				System.out.println("Please enter first side: ");
				int side1=input.nextInt();
				System.out.println("Please enter second side: ");
				int side2=input.nextInt();
				
				int area=(2*side1*side2);
				int circumference= ((side1*2)+(side2*2));
				System.out.println("Area: "+area);
				System.out.println("Circumference: "+circumference);
				input.close();
			}
			
}
