package whileloop;

public class WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i = 1;
		while (i < 5) {
			System.out.println("Hello");
			i++;
		}

		System.out.println("Out from the loop");
		System.out.println(i);
		
		int k=1;
		while(k <= 10) {
			System.out.println(k +". I love JAVA ");
			k++;
		}
		
		int l=0;
		while(l <=20) {
			System.out.print(l+", ");
			l++;
		}
		l=0;
		while(l <=20) {
			System.out.println(l+", ");
			Thread.sleep(1000);
			l++;
		}
		
		
		
	}

}
