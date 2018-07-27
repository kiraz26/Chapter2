package whileloop;

public class AnimalArrayWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cuteAnimals=new String[26];
		cuteAnimals[0]="Giraffe";
		cuteAnimals[1]="Crocadile";
		cuteAnimals[2]="Dog";
		cuteAnimals[3]="Lemur";
		cuteAnimals[4]="Bear";
		cuteAnimals[5]="Tiger";
		cuteAnimals[6]="Bird";
		cuteAnimals[7]="Rabbit";
		cuteAnimals[8]="Sheep";
		cuteAnimals[9]="Koala";
		cuteAnimals[10]="Cow";
		cuteAnimals[11]="Donkey";
		cuteAnimals[12]="Elephant";
		cuteAnimals[13]="Duck";
		cuteAnimals[14]="Polar Bear";
		cuteAnimals[15]="Hippo";
		cuteAnimals[16]="Frog";
		cuteAnimals[17]="Small Bear";
		cuteAnimals[18]="Coat";
		cuteAnimals[19]="Hedgehog";
		cuteAnimals[20]="Rakuun";
		cuteAnimals[21]="Monkey";
		cuteAnimals[22]="Lion";
		cuteAnimals[23]="Panda";
		cuteAnimals[24]="Pig";
		cuteAnimals[25]="Penguin";
		
		int lengthOfArray=cuteAnimals.length;
		System.out.println(lengthOfArray);
		int index=0;
		
		while(index < cuteAnimals.length) {
			System.out.println(index+". "+cuteAnimals[index]);
			index++;
		}
		
	}

}
