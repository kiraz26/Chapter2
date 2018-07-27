package aritmeticoperators;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Logical OR Operator
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int orderAmount=input.nextInt();
		System.out.println("Is Amazon Prime?");
		
		boolean isAmazonPrime=input.nextBoolean();
		
		if(orderAmount>35 || isAmazonPrime==true) {
			System.out.println("Free shipping");
		}else {
			System.out.println("Do you wanna sign up for Prime?");
		}
		
		
	}

}
