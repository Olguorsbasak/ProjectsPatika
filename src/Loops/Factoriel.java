package week3.patikadev.java101.loops;
import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		int fac=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number to calculate: ");
		int num=input.nextInt();
		
			for(int i=1;i<=num;i++) {
				fac=fac*i;
			}
			System.out.println(num+ "! = "+fac);
	input.close();
}
}