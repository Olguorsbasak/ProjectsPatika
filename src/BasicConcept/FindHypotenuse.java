package week1.patikadev.java101.basicconcept;
import java.util.Scanner;

public class FindHypotenuse {

	public static void main(String[] args) {
		
		double area;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter  first leg side: ");
		int side1=input.nextInt();
		System.out.println("Please enter second leg side: ");
		int side2=input.nextInt();
		
		
		double hypo= Math.pow(side1,2)+ Math.pow(side2,2);
		double lastHypo=Math.sqrt(hypo);
		
		
		double u=(side1+side2+lastHypo/2);
		double circumference=2*u;
		area= u*(u-side1)*(u-side2)*(u-lastHypo);
		double areaResult=area*area;
		
		
		System.out.println("Your hypotenuse result is "+lastHypo+ " cm");
		System.out.println("Your triangle circumference is "+circumference);
		System.out.println("Your triangle area is "+ Math.sqrt(areaResult));
		
		input.close();
	}
		
}
