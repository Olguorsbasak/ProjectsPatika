package week3.patikadev.java101.loops;
import java.util.Scanner;

public class FindMinMaxNumber {

	public static void main(String[] args) {
		int counter,num,min=0,max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many number will you enter : ");
        counter = input.nextInt();

        for(int i=1; i<=counter;i++){
            System.out.print(i + ". enter the number : "  );
            num = input.nextInt();

            if (i==1){
                max=num;
                min=num;
            }else{
                if (num>max){
                    max=num;
                } else if (num<min) {
                    min=num;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        input.close();
	}

}
