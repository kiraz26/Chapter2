package day11;

import java.util.Scanner;

public class SeasonDrink {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the month:");
		int month=input.nextInt();
		
		if(month == 12 || month == 1 || month == 2 ) {
			System.out.println("Season: Winter");
			System.out.println("Drink: Pumpkin Spice");
		}else if(month == 3 || month == 4 || month == 5) {
			System.out.println("Season: Spring");
			System.out.println("Drink: Caramel Mochioto");
		}else if(month == 6 || month == 7 || month == 8) {
			System.out.println("Season: Summer");
			System.out.println("Drink: Ice Coffee");
		}else if(month == 9 || month == 10| month == 11) {
			System.out.println("Season: Summer");
			System.out.println("Drink: Turkish Tea");
		}
	
	}

}
