package aritmeticoperators;

public class BasicCalculations {
	public static void main(String[] args) {
		
	
	//addition
	int n=10;
	int k=3;
	int plus=n+k;
	
	int minus=n-k;
	int multiply=n*k;
	int divide=n/k; // we are losing decimal points
	int remainder=n%k;
	
	System.out.println("plus: "+ plus);
	System.out.println("minus: "+ minus);
	System.out.println("multiply: "+ multiply);
	System.out.println("divide: "+ divide);
	System.out.println("remainder: "+ remainder);
	
	// % remainder operator
	
	int rem=20%5;
	System.out.println("remainder: "+rem);
	
	rem=43%2;
	System.out.println("remainder: "+rem);
	
	int result=10+2*3;
	System.out.println(result);
	
	result=10&2;
	boolean b=result == 0;
	System.out.println("Is it even?" +b);
	
	}
}
