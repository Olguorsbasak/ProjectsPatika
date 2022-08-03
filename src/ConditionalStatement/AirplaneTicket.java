package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;
public class AirplaneTicket {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an instance to travel (km):  ");
		int instance=input.nextInt();
		System.out.println("Please enter your age: ");
		int age=input.nextInt();
		System.out.println("Please enter your trip way. 1-One Way 2-Dual");
		int tripType=input.nextInt();
		
		if(instance<0 ) {
			System.out.println("Wrong entry");
		}else if(age<0) {
			System.out.println("Wrong entry");
		}else if(tripType!=1 || tripType!=2) {
			System.out.println("Wrong entry");
		}
		
		double price=instance*0.10;
		
		if(age<12) {
			double price1=price-(price*0.5);
			System.out.println("Total price: "+price1);
			if(tripType==2) {
				double price2=price1-(price1*0.2);
				System.out.println("Total price: "+price2);
			}
		}else if(age>=12 && age<=24) {
			double price3=price-(price*0.1);
			System.out.println("Total price: "+price3);
			if(tripType==2) {
				double price4=price3-(price3*0.2);
				System.out.println("Total price: "+price4);
			}
		}else if(age>65) {
			double price5=price-(price*0.3);
			System.out.println("Total price: "+price5);
			if(tripType==2) {
				double price6=price5-(price5*0.2);
				System.out.println("Total price: "+price6);
				
			}
		}
		input.close();
		
	}

}
