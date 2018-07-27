package aritmeticoperators;

public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ppl1=5;
		int ppl2=6;
		System.out.println(ppl1 > ppl2); //answer is a boolean
		boolean comp=ppl1<ppl2;
		System.out.println(comp);
		
		int apples=10;
		int oranges=10;
		System.out.println(apples == oranges);
		System.out.println(apples >= oranges);
		
		char letter1='a';
		char letter2='b';
		
		comp=letter1 > letter2;
		System.out.println(comp);
		
		letter1++;
		letter1++;
		System.out.println(letter1);
		
		apples = 10;
		oranges=11;
		System.out.println(apples != oranges);
		
		comp=apples++ < oranges--;
		System.out.println(comp);
		
		comp=++apples < --oranges;
		System.out.println(comp);
		
		
		
	}

}
