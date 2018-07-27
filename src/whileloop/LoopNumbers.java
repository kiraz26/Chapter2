package whileloop;

import java.util.Scanner;

public class LoopNumbers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to start:");
		
		int i;
		for(i=scanner.nextInt(); i<=10; i++) {
			System.out.print(i+" ");
			Thread.sleep(300);
		}
			
		System.out.println();
		System.out.println(i);
		
		
		
	}

}
