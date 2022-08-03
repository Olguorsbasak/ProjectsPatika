package week3.patikadev.java101.loops;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Please enter a number :");
	        int number = input.nextInt();
	        int basNumber = 0;
	        int tempNumber = number;
	        int basValue;
	        int result = 0;
	        int basPow;
	        int sum=0;

	        while (tempNumber != 0) {
	            tempNumber /= 10;
	            basNumber++;
	        }

	        tempNumber = number;
	        while (tempNumber != 0) {
	            basValue = tempNumber % 10;
	            // 1*1*1*1 = 1^4
	            basPow = 1;
	            for (int i = 1; i <= basNumber; i++) {
	                basPow *= basValue;
	            }
	            result += basPow;
	            tempNumber /= 10;
	        }

	        if (result == number) {
	            System.out.println(number + " is a Amstrong Number.");
	        } else {
	            System.out.println(number + " is not a Amstrong Number.");
	        }
	        
	        while(number>0) {
	        	sum+=number%10;
	        	number/=10;
	        	
	        }
	        System.out.println("Sum of Digits: "+sum);
	        input.close();
	}

}
