package aritmeticoperators;

public class MultipleCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		//true and true------->true
		//true and false------>false
		//false and false----->false
		//false and true------>false
		if(i<15 && i>5) {
			System.out.println("Value of i is 5<i<15");
		}else {
			System.out.println("not true");
		}
		
	}

}
