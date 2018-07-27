package aritmeticoperators;

import java.util.Scanner;

public class OCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exam score:");

		int examResult = input.nextInt();
		char grade;

		if (examResult > 90) {
			grade = 'A';
			System.out.println("Your grade is " + grade);
		} else if (examResult > 80) {
			grade = 'B';
			System.out.println("Your grade is " + grade);
		} else if (examResult > 70) {
			grade = 'C';
			System.out.println("Your grade is " + grade);
		} else if (examResult > 65) {
			grade = 'D';
			System.out.println("Your grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("Failed " + grade);
		}
		System.out.println("The value of grade is " + grade);
	}

}
