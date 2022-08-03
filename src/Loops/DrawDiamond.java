package week3.patikadev.java101.loops;
import java.util.Scanner;
public class DrawDiamond {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		int i,k,num,j,l,m;
		System.out.println("Please enter a number: ");
		num=input.nextInt();
		   for (i=1;i<=num;i++)
		            {
		   for (k=num;k>i;k--)
		            {
		        System.out.print(" ");
		                }
		   for (j = 1; j <=i ; j++)
		                {
		        System.out.print("*"+" ");
		                }
		        System.out.println();
		            }
		
		    for (k=1;k<=num;k++)
		            {
		    for (l =1 ; l <=k; l++)
		                {
		        System.out.print(" ");
		                }
		    for (m = num; m >k ; m--)
		                {
		        System.out.print("*"+" ");
		                }
		        System.out.println();
		            }
		    input.close();
	}
	
}
