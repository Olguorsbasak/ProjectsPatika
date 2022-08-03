package week3.patikadev.java101.loops;
import java.util.Scanner;

public class ListofPrimeNumber {

	public static void main(String[] args) {
	       Scanner input=new Scanner(System.in);
	        System.out.println("Please enter first number: ");
	        int num1=input.nextInt();
	        System.out.println("Please enter second number: ");
	        int num2=input.nextInt();
	               
	        for (int i =num1; i <= num2; i++)             
	        {
	            boolean prime=true;
	            for(int j=2;j<=(i/2)+1;j++)
	                
	            if(i%j==0)
	            {
	                prime=false;
	                break;
	            }
	             if(prime)
	                System.out.println(i+"\t");
	           
	        }
	           input.close();
	    }
	    
	}