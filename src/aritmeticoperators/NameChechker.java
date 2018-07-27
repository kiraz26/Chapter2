package aritmeticoperators;
import java.util.Scanner;
public class NameChechker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=input.nextLine();
		
		char firstLetter=name.charAt(0);
		
		if(firstLetter != 'A') {
			System.out.println("Your name's first letter is not A");
		}else {
			System.out.println("Your name's first letter is A");
		}
	}

}
