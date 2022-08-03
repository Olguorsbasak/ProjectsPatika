package week3.patikadev.java101.loops;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num=input.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
				
			}
		}
			if(num==sum) {
				System.out.println(num+" is a perfect number");
				
			}else {
				System.out.println(num+" is not a perfect number");
			}
			input.close();
		}
	}


