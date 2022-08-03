package week1.patikadev.java101.basicconcept;
import java.util.Scanner;
public class CalculateVAT {

	public static void main(String[] args) {
		double tax1=1.8;
		double tax2=0.8;
		double newPrice;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the price to calculate: ");
		double price=input.nextDouble();
		
		if(price<1000) {
			newPrice=price+(price*tax1);
			System.out.println("New Price is "+ newPrice);
		}else if(price>=1000) {
			newPrice=price+(price*tax2);
			System.out.println("New Price is "+newPrice);
		}else {
			System.out.println("Please check your information");
		}

		input.close();
	}

}
