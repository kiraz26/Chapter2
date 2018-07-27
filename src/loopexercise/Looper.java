package loopexercise;

public class Looper {

	public void LoopFromNumToNum(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public int LoopAndSum(int start, int end) {
		int total = 0;
		for (int i = start; i <= end; i++) {

			total = total + i;
		}

		return total;

	}

}
