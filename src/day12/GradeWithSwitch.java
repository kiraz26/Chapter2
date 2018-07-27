package day12;

import java.util.Scanner;

public class GradeWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the grade:");
		char grade = input.next().charAt(0);

		switch (grade) { // byte, short, int, double, String, enum
		case 'A':
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'b':
			System.out.println("Good Job");
			break;
		case 'C':
		case 'c':
			System.out.println("Good");
			break;
		case 'D':
		case 'd':
			System.out.println("Poor");
			break;
		case 'F':
		case 'f':
			System.out.println("Failed");
			break;
		default:
			System.out.println("Enter Correct Grade: only ABCDF accepted");
		}

	}

}
