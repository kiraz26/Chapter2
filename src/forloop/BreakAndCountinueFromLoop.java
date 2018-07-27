package forloop;

public class BreakAndCountinueFromLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
			if (i == 5) {
				break;
			}
		}

		System.out.println();

		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
			if (i == 6) {
				break;
			}
		}

		System.out.println();

		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");

		}

		System.out.println();

		for (int i = 10; i >= 0; i--) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");

		}

	}
}
