package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a year to calculate: ");
		int year=input.nextInt();
		
		if((year%4==0) &&(year%400==0) ) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+ " is not a leap year");
		}
		input.close();
	}

}
