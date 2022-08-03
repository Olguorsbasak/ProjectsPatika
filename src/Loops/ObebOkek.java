package week3.patikadev.java101.loops;
import java.util.Scanner;
public class ObebOkek {

	public static void main(String[] args) {
		int ebob=1;
		int ekok;
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter first number: ");
	int num=input.nextInt();
	System.out.println("Please enter second number: ");
	int num2=input.nextInt();
	for(int i=1;i<=num &&i<=num2 ;++i) {
		if(num%i==0 && num2%i==0) {
			ebob=i;
		}
	}
		ekok=(num*num2)/ebob;
		System.out.println("EBOB: "+ebob);
		System.out.println("EKOK: "+ekok);
		input.close();
	}

}
