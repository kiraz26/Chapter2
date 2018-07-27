package whileloop;

public class LoopWithIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		while(num <= 60) {
			if(num%2 == 0) {
				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println();
		num=0;
		while(num <= 60) {
			if(num%2 == 1) {
				System.out.print(" "+num);
			}
			num++;
		}
		
		
		
		
		
	}

}
