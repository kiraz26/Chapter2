package forloop;

public class forLoops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) { // (initialization; termination; increment;)
			System.out.println("HAPPY NEW YEAR " + i);
		}
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
			Thread.sleep(600);
		}
		
	}

}
