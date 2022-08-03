package week3.patikadev.java101.loops;
import java.util.Scanner;
public class DrawUpsideTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of digits: ");
		int num=input.nextInt();	
		for(int i =1;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=2*num-1;k>=(2*i+1);k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	
	}

}
