package whileloop;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("Enter Number 1");
		 * int num = input.nextInt();
		 * while (num != 1) { System.out.println("I said enter 1"); num =
		 * input.nextInt(); }
		 * System.out.println("Thank you");
		 */
		
		int num;
		do {
			System.out.println("Enter Number 1");
			num = input.nextInt();

		} while (num != 1);

		System.out.println("Thank you");
		
		
		
		int newnumber=10;
		while(newnumber >= 0) {
			System.out.print(newnumber+" ");
			newnumber--;
		}
		System.out.println();
		newnumber=10;
		do {
			System.out.print(newnumber+" ");
			Thread.sleep(500);
			newnumber--;
		}while(newnumber >= 0);
		
	}

}
