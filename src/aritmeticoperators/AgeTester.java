package aritmeticoperators;
import java.util.Scanner;
public class AgeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=input.nextInt();
		
		if(age >= 18) {
			System.out.println("Adult");
		}else {
			System.out.println("Not Adult");
		}
		
		if(age == 18) {
			System.out.println("You are 18 years old");
		}
		
		if(age != 18) {
			System.out.println("You are not 18 years old");
		}
		
	}

}
