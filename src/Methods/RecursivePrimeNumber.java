package week4.patikadev.java101.methods;
import java.util.Scanner;

public class RecursivePrimeNumber {

	public static void main(String[] args) {
		int num,prime;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num=input.nextInt();
		
		prime=isPrime(num,num/2);
		if(prime==1) {
			System.out.println(num +" is a prime number");
			
		}else {
			System.out.println(num+" is not a prime number");
		}
		input.close();

	}
	public static int isPrime(int num,int i) {
		if(i==1) {
			return 1;
		}else {
			if(num%i==0) {
				return 0;
			}else return isPrime(num,i-1);
		}
		
		
	}

}
