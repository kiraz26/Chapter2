package aritmeticoperators;
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=input.nextLine();
		
		if(name.startsWith("A") && name.endsWith("C")) {
			System.out.println("Bingo");
		}else {
			System.out.println("Ah-nooo");
		}
		
		
		
		
	}

}
