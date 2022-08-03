package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;

public class ChooseActivity {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a temperature: ");
		int tem=input.nextInt();
		
		if(tem<5) {
			System.out.println("Ski");
		}else if(tem>=5 && tem<=15) {
			System.out.println("Cinema");
		}else if(tem>=15 && tem<=25) {
			System.out.println("Picnic");
		}else if(tem>=25) {
			System.out.println("Swim");
		}else {
			System.out.println("Check your information");
			
	}
		input.close();
}
}
