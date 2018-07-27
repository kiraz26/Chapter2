package switchstatements;

import java.util.Scanner;

public class CalculatorV2 {
	public static void main(String[] args) {
		
	
	int num1;
	int num2;
	String operator;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your first number:");
	num1=input.nextInt();
	System.out.println("Enter your second number:");
	num2=input.nextInt();
	System.out.println("Enter your operator:");
	operator = input.next();
	
	int result;
	
	switch(operator) {
	case "+":
		result=num1+num2;
		System.out.println("Result ="+result);
		break;
	case "-":
		result=num1-num2;
		System.out.println("Result ="+result);
		break;
	case "*":
		result=num1*num2;
		System.out.println("Result ="+result);
		break;
	case "/":
		if(num2!=0) {
		result=num1/num2;
		System.out.println("Result ="+result);
		}else {
			System.out.println("You cannot choose 0 for second number");
		}
		break;
	default:
		System.out.println("Result: ERROR");

	
	}
	
	}
}
