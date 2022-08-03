package week1.patikadev.java101.basicconcept;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter radius:");
		int radius=input.nextInt();
		
		double area= radius*Math.PI*radius;
		double circumference=2*Math.PI*radius;
		
		System.out.println("Area is "+ area);
		System.out.println("Circumference is "+circumference);
		
		System.out.println("Please enter central angle:  ");
		int angle=input.nextInt();
		double circleSlice=(Math.PI*(radius*radius*angle)/360);
		System.out.println("CircleSlice: "+circleSlice);

		input.close();
	}

}
