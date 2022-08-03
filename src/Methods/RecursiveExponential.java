package week4.patikadev.java101.methods;

import java.util.Scanner;

public class RecursiveExponential {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int base, expo;
	        System.out.println("Please enter base: ");
	        base = input.nextInt();
	        System.out.println("Please enter exponential: ");
	        expo = input.nextInt();

	        System.out.println(expon(base, expo) );
	        input.close();
	}
	
	public static int expon(int base,int expo) {
		   if (base == 1 || expo == 0) { 
	            return 1;
	        }
	        return base * expon(base, expo - 1);
	        
	}
}
