package day12;

import java.util.Scanner;

public class LoginValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "Halil";
		String pass = "123";

		Scanner input = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = input.nextLine();
		System.out.println("Enter password:");
		String password = input.nextLine();

		if (username.equalsIgnoreCase(user) && password.equals(pass)) {
			System.out.println("Login successful");
		} else if (username.length() == 0 || password.length() == 0) {
			if (username.length() == 0) {
				System.out.println("Username cannot be blank");
			}
			if (password.length() == 0) {
				System.out.println("Password cannot be blank");
			}
		} else if (!username.equalsIgnoreCase(user) || !password.equals(pass)) {
			if (!username.equals(user)) {
				System.out.println("Username is not correct");
			}
			if (!password.equals(pass)) {
				System.out.println("Username is not correct");
			}
		}

	}

}
