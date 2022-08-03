package week2.patikadev.java101.conditionalstatement;
import java.util.Scanner;
public class ChinesseZodiac {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your birth year: ");
		int year=input.nextInt();
		
		int zodiac=year%12;
		
		switch(zodiac) {
		
		case 0: 
			System.out.println("Chinese Zodiac: Monkey");
			break;
		case 1: 
			System.out.println("Chinese Zodiac: Cock");
			break;
		case 2:
			System.out.println("Chinese Zodiac: Dog");
			break;
		case 3:
			System.out.println("Chinese Zodiac: Pig");
			break;
		case 4:
			System.out.println("Chinese Zodiac: Mouse");
			break;
		case 5:
			System.out.println("Chinese Zodiac: Ox");
			break;
		case 6:
			System.out.println("Chinese Zodiac: Tiger ");
			break;
		case 7:
			System.out.println("Chinese Zodiac: Rabbit");
			break;
		case 8: 
			System.out.println("Chinese Zodiac: Dragon");
			break;
		case 9: 
			System.out.println("Chinese Zodiac : Snake");
			break;
		case 10:
			System.out.println("Chinese Zodiac: Horse");
			break;
		case 11:
			System.out.println("Chinese Zodiac: Sheep");
			break;
		default:
			break;
		
			
		}
		
		input.close();
	}

}
