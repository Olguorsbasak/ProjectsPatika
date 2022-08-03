package week4.patikadev.java101.methods;
import java.util.Scanner;

public class RecursiveDesign {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
       
        System.out.println("***Recursive Design***");
        System.out.println("----------------------");
        System.out.print("Please enter a number ");
        int number = input.nextInt();
        System.out.println("-----------------------");
        System.out.println(design(number, true, 0));
       input.close();

	}
	 static int design(int number, boolean control, int flag)
	    {
	        if (control)
	        {
	            if (number > 0)
	            {
	                System.out.print(number + " ");
	                flag++;
	                return design(number - 5, true, flag);
	            }
	            else
	            {
	                return design(number, false, flag);
	            }
	        }
	        else
	        {
	            System.out.print(number + " ");
	            if (flag > 0)
	            {
	                flag--;

	                return design(number + 5, false, flag);
	            }
	            else
	            {
	                return 0;

	            }

	        }
}
}