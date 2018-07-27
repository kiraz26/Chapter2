package groupproject3;
import java.util.Scanner;
public class vendingMachineChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int quarter=25;
		int dime=10;
		int nickel=5;
		
		System.out.println("Enter the product price:");
		int price=input.nextInt();
		int change=100-price;
		int quarterFormula=change/25;
		int quarterRemain=change%25;
		int dimeFormula=quarterRemain/10;
		int dimeRemain=quarterRemain%10;
		int nickelFormula=dimeRemain/5;
		int nickelRemain=dimeRemain%5;
		
		if(quarterRemain == 0) {
			System.out.println("Your change is "+ quarterFormula +" quarters, 0 dimes, and 0 nickels.");
		}else if(quarterRemain > 0  & dimeRemain == 0 ) {
			
			System.out.println("Your change is "+ quarterFormula +" quarters, " +dimeFormula+ " dimes, and 0 nickels.");
		}else if(quarterRemain >1  & dimeRemain > 1 & nickelRemain == 0) {
			
			System.out.println("Your change is "+ quarterFormula +" quarters, " +dimeFormula+ " dimes, and "+ nickelFormula +" nickels.");
			
		}
		
	}

}
