package week3.patikadev.java101.loops;
import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		int i;
		int num;
		int result=0;
		
		Scanner input=new Scanner(System.in);
		do {
			System.out.print("Please enter a number: ");
			num=input.nextInt();
			
				for(i=1;i<=num;i++) {
						if(num%2==1) {
							result +=i;
				}
				//result +=num;
			}
			
			System.out.println("Sum of odd numbers up to the numbers you entered: "+result);
		}while(num>=0);
		System.out.println("You logged out!");
		System.exit(0);
		
	}

}
