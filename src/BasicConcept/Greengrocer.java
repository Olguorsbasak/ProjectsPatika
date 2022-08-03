package week1.patikadev.java101.basicconcept;
import java.util.Scanner;
public class Greengrocer {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Pear(kg): ");
		double pear=input.nextDouble();
		System.out.println("Apple(kg): ");
		double apple=input.nextDouble();
		System.out.println("Tomato(kg): ");
		double tomato=input.nextDouble();
		System.out.println("Banana(kg): ");
		double banana=input.nextDouble();
		System.out.println("Aubergine(kg): ");
		double aubergine=input.nextDouble();
		
		double price=(pear*2.14)+(apple*3.67)+(tomato*1.11)+(banana*0.95)+(aubergine*5.00);
		
		System.out.println("Total result: "+price+" tl");
		input.close();
	}

}
