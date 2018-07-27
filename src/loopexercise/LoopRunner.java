package loopexercise;

import java.util.Scanner;

public class LoopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting number:");
		int num1 = input.nextInt();
		System.out.println("Enter ending number:");
		int num2 = input.nextInt();

		Looper looper = new Looper();
		looper.LoopFromNumToNum(num1, num2);
		looper.LoopAndSum(num1, num2);
		int sum = looper.LoopAndSum(num1, num2);
		System.out.println("Sum of all numbers is " + sum);
	}

}
