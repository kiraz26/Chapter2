package aritmeticoperators;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If you want to convert one type to another, you perform casting.
		//2 types of casting in Primitives
		//1)Implicit casting
			//it happens automatically
				//byte>short>int>long>float>double
		//2)Explicit casting
			//manually
				//Anything reverse
					//byte>short>int>long>float>double
	//	IMPLICIT CASTING
		int intNum=100;
		double d=intNum;
		System.out.println("double: "+d);
		byte b=5;
		short sh=b;
		
		d=100.66;
		int i=(int)d;
		System.out.println(i);
		
		i=1000;
		b=(byte)i;
		System.out.println(b);
		
		int n=10;
		int k=3;
		double divide=(double)n/(double)k;
		System.out.println(divide);
		
		byte b1=5;
		byte b2=3;
		byte b3=(byte)(b1*b2);
		
		double div=7/2;
		System.out.println(div);
		
		//SHORTHAND OPERATORS:
		int apples=5;
		apples=apples+3;
		apples+=3;
		apples+=2;
		
		
	}

}
