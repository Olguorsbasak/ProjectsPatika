package week3.patikadev.java101.loops;
import java.util.Scanner;
public class DrawTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number to draw: ");
		int num=input.nextInt();
		for(int i=0; i<=num;i++) {
			for (int j=0;j<(num-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i+1);k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		input.close();
	}

}
