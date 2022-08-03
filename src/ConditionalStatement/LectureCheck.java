package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;

public class LectureCheck {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your Maths point: ");
		int math=input.nextInt();
		System.out.println("Please enter your Physics point: ");
		int physics=input.nextInt();
		System.out.println("Please enter your Turkish point: ");
		int turkish=input.nextInt();
		System.out.println("Please enter your Chemistry point: ");
		int chemistry=input.nextInt();
		System.out.println("Please enter your Music point: ");
		int music=input.nextInt();
		
		
		if(math<=0 || math>=100) {
			double ave1=(physics+turkish+chemistry+music)/4;
			System.out.println("Your result: "+ave1);
		}else if(physics<=0 || physics>=100) {
			double ave2=(math+turkish+chemistry+music)/4;
			System.out.println("Your result: "+ave2);
		}else if (turkish<=0 || turkish>=100) {
			double ave3=(math+physics+chemistry+music)/4;
			System.out.println("Your result: "+ave3);
		}else if (chemistry<=0 || chemistry>=100) {
			double ave4=(math+physics+turkish+music)/4;
			System.out.println("Your result: "+ave4);
		}else if (music<=0 || music>=100) {
			double ave5=(math+physics+turkish+chemistry)/4;
			System.out.println("Your result: "+ave5);
		}else {
			System.out.println("Please check your information");
		}
		input.close();
		
	}

}
