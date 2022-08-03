package week3.patikadev.java101.loops;
import java.util.Scanner;


public class FindEvenNumber {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num=input.nextInt();
		for(int i=0;i<=num;i++) {
			if(i%2==1) {
				i++;
			}
			System.out.println("Even number list:"+ i);
		}
		
		for(int j=0;j<=num;j++) {
			if(j%3==0)  {
				//j++;
				System.out.println("List of numbers divisible by 3: "+j);
			}
		}
		input.close();
			
		}
		
		
	}


