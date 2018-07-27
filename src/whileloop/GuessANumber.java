package whileloop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secretNumber = random.nextInt(100);

		Scanner input = new Scanner(System.in);
		int myNumber;
		int attemps=1;
		do {
			System.out.println("Guess the secret number");
			myNumber = input.nextInt();
			if (myNumber == secretNumber) {
				System.out.println("Attemps: "+attemps);
				System.out.println("Good Job");
			} else if (myNumber > secretNumber) {
				System.out.println("Attemps: "+attemps);
				System.out.println("Too large");
				attemps++;
			} else if (myNumber < secretNumber) {
				System.out.println("Attemps: "+attemps);
				System.out.println("Too small");
				attemps++;
			}
			
		} while (secretNumber != myNumber && attemps <= 10);

		System.out.println("Secret number is " + secretNumber);

	}

}
