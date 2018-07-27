package loopexercise;

public class SkipDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days=new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < days.length; i++) {
			if(i == 3) {
				continue;
			}
			System.out.print(days[i]+" ");
		}
		System.out.println();

		for (int i = 0; i < days.length; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(days[i]+" ");
		}
		
	}

}
