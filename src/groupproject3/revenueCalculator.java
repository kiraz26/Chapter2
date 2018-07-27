package groupproject3;

import java.util.Scanner;

public class revenueCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter price of the product:");
		double price=input.nextDouble();
		
		System.out.println("Enter quantity of the product:");
		double quantity=input.nextDouble();
		
		double revenueBeforeDiscount=price*quantity;
		System.out.println("Your revenue is :"+revenueBeforeDiscount);
		
		if (100 <= quantity & quantity <=120) {
			double revenue=revenueBeforeDiscount-(revenueBeforeDiscount*10/100);
			System.out.println("The revenue from sale: "+revenue+"$");
			System.out.println("After discount: "+revenueBeforeDiscount*10/100+"(10.0%)");
		}else if(120 < quantity) {
			double revenue=revenueBeforeDiscount-(revenueBeforeDiscount*15/100);
			System.out.println("The revenue from sale: "+revenue+"$");
			System.out.println("After discount: "+revenueBeforeDiscount*15/100+"(15.0%)");
		}else if(quantity<100) {
			double revenue=revenueBeforeDiscount;
			System.out.println("The revenue from sale: "+revenue+"$");
			System.out.println("After discount: "+revenueBeforeDiscount+"(0.0%)");
		} 
	
	}

}
