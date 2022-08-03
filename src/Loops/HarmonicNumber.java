package week3.patikadev.java101.loops;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		double harm=0;
		double unit=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num=input.nextInt();
		System.out.println();
	
		for(int i=1;i<=num;i++) {
			unit=(1.0/i);
			harm+=unit;
		}
		System.out.println(harm);
		input.close();	
		}
	
}
