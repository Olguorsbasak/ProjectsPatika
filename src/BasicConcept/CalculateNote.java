package week1.patikadev.java101.basicconcept;
import java.util.Scanner;

public class CalculateNote {

	public static void main(String[] args) {
		System.out.println("***Welcome***");
		System.out.println("===============");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter Math Note: ");
		int math=input.nextInt();
		System.out.println("Please enter Physics Note: ");
		int physics=input.nextInt();
		System.out.println("Please enter Chemistry Note: ");
		int chemistry=input.nextInt();
		System.out.println("Please enter Turkish Note: ");
		int turkish=input.nextInt();
		System.out.println("Please enter History Note: ");
		int history=input.nextInt();
		System.out.println("Please enter Music Note: ");
		int music=input.nextInt();
		
		int ave=(math+physics+chemistry+turkish+history+music)/6;
		
		String str=(ave<60)?("You failed"):("You passed");
		System.out.println(str);
		/*if-else döngüsüne gerek kalmadan tek satır içersinde
		 * yazmak için (var olan şart) gerçekleşirse ? değilse : kullanılacak
		 * şekilde yazılabilir. 
		 */
		input.close();

	}

}
