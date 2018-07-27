package aritmeticoperators;

public class IncrementsAndDecrements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ppl=3;
		ppl++; //increments by one
		System.out.println(ppl);
		++ppl; //increments by one
		System.out.println(ppl);
		
		ppl++;
		ppl++;
		System.out.println(ppl);
		
		--ppl; //OR ppl--;
		System.out.println(ppl);
		
		ppl++;
		System.out.println(ppl);
		
		ppl-=1; ppl--; --ppl; // other types
		System.out.println(ppl);
		
		int ppl2=5;
		int totalPpl=++ppl2;
		System.out.println(totalPpl);
		System.out.println(ppl2);
		
		ppl2=5;
		int totalPpl2=5;
		totalPpl2=ppl2++ + ++ppl2;
		System.out.println(totalPpl2);
		System.out.println(ppl2);
		
		int i=2;
		int j=3;
		int p=i++ + ++j;
		System.out.println(p);
		System.out.println(i);
		System.out.println(j);
		//	totalPpl=ppl2++;
		//System.out.println(totalPpl);
	
		
		
	}

}
