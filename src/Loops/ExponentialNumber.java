package week3.patikadev.java101.loops;
import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter base number: ");
		int baseNum=input.nextInt();
		System.out.println("Please enter exponents number: ");
		int expoNum=input.nextInt();
		
		double result=(int)Math.pow(baseNum, expoNum);
		System.out.println(result);
		
		System.out.println("Please enter a number to calculate: ");
		int num=input.nextInt();
		for(int i=1;i<=num;i++) {
			double result2=(int)Math.pow(i,num);
			System.out.println("Your result: "+result2);
		}
			
		input.close();
		}

	}


