package week1.patikadev.java101.basicconcept;
import java.util.Scanner;

public class CalculateTaximeter {

	public static void main(String[] args) {
	
		int openPrice=10;
		double lastPrice = 0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of kilometers to be traveled: ");
		int km=input.nextInt();
		lastPrice=openPrice+(km*2.20);
		if(lastPrice<20) {
			System.out.println("Amount to be paid : 20 TL ");
		}else {
			System.out.println("Amound to be paid : "+lastPrice+" TL");
		}
			input.close();

	}

}
