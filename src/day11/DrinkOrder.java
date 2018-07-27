package day11;
import java.util.Scanner;
public class DrinkOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Do you wanna cold or hot drink?");
		boolean hot=true;
		boolean cold=false;
		if(hot) {
			System.out.println("Do you wanna tea or coffee?");
		}else if(cold) {
			System.out.println("So you wanna water or juice?");
			boolean water = true;
			boolean juice = true;
			if(water) {
				System.out.println("You selected water");
			}else if(juice) {
				System.out.println("You selected juice");
			}
		}
		
	}

}
