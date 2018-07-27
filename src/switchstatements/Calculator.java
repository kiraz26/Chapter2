package switchstatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		String operator;

		System.out.println("Enter your first number:");

		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();

		System.out.println("Enter your second number:");
		num2 = input.nextInt();

		System.out.println("Enter your operator:");
		operator = input.next();

		int result;

		if (operator.equals("+")) {
			result = num1 + num2;
			System.out.println("Result: " + result);
		} else if (operator.equals("-")) {
			result = num1 - num2;
			System.out.println("Result: " + result);
		} else if (operator.equals("*")) {
			result = num1 * num2;
			System.out.println("Result: " + result);
		} else if (operator.equals("/")) {
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Result: " + result);
			} else if (num2 == 0) {
				System.out.println("You cannot choose 0 for second number");
			}
		}

	}

}
