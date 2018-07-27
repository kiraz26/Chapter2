package switchstatements;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class IcecreamSelection {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Ne vereyim abimee:");
		String selection=input.nextLine();
		
		switch(selection.toLowerCase()) {
			case "strawberry":
				System.out.println("You selected "+selection);
				break;
			case "cranberry":
				System.out.println("You selected " +selection);
				break;
			default:
				
				System.out.println("iimm................................" );
				TimeUnit.SECONDS.sleep(3);
				System.out.println("Cukulatali veremmi abi" );

		}
		
		
	}
}
