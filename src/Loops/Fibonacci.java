package week3.patikadev.java101.loops;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int num1=0,num2=1,num3,i,num;
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        System.out.print(num1+" "+num2);
  
        	for(i=2;i<num;++i)  
        	{  
        			num3=num1+num2;  
        			System.out.print(" "+num3);  
        			num1=num2;  
        			num2=num3;  
        	}
        	System.out.println();
        	input.close();
    }
	
}

	

