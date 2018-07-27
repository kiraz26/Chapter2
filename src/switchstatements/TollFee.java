package switchstatements;
import java.util.Scanner;
public class TollFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int carType;
		double fee;
		Scanner input=new Scanner(System.in);
		System.out.println("Chose your car type:\n 1. Passenger Car \n 2. Bus \n 3. Truck");
		carType=input.nextInt();
		
		switch(carType) {
		case 1:
			fee=2.50;
			System.out.println("Passenger car fee amount: "+fee);
			break;
		case 2:
			fee=5.00;
			System.out.println("Bus fee amount: "+fee);
			break;
		case 3:
			fee=6.50;
			System.out.println("Truck fee amount: "+fee);
			break;
		default:
			fee=9.80;
			System.out.println("Your vehicle fee amount: "+fee);
				
			
		}
			
	}

}
