package week3.patikadev.java101.loops;
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num=input.nextInt();
		
		for(int i=0;i<=num;i++) {
			double result=(int)Math.pow(2, i);
			
				System.out.println(result);
			}
		input.close();
		}

	}


