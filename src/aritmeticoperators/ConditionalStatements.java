package aritmeticoperators;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apples=10;
		int bananas=15;
		
		if(bananas < apples) {
			System.out.println("We have more bananas than apples");
		}
		
		int ppl=10;
		int capacity=5;
		//check if number of ppl is equal or less than capacity
		//if true print welcome all
		//check another if condition number of ppl is more than capacity
		//some passenger need to kindly get out
		if(ppl <= capacity) {
			System.out.println("Welcome all");
		}
		if(ppl >= capacity) {
			System.out.println("Some passenger need to kindly get out");
		}
		String lan="Java";
		//if the lan is Java then say good job, otherwise say u better learn
		//java
		
		if(lan.equals("Java")) {
			System.out.println("Good Job");
		}else {
			System.out.println("You should learn better");
		}
		//====================================================================
		
		
		
	}

}
