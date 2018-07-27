package whileloop;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;

		while (number <= 10) {
			System.out.print(number + " ");
			number++;
		}
		System.out.println();
		number--;

		do {
			System.out.print(number + " ");
			number--;
		} while (number >= 1);

	}

}
