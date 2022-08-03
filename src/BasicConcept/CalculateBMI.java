package week1.patikadev.java101.basicconcept;
import java.util.Scanner;
public class CalculateBMI {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your height (m): ");
		double height=input.nextDouble();
		System.out.println("Please enter your weight (kg) ");
		double weight=input.nextDouble();
		
		double bodyMassIndex=weight/(height*height);
		System.out.println("Your BMI result is "+ bodyMassIndex );

		input.close();
	}

}
