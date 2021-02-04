package GamePackage;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		String name = null;
		String color = null;
		String race = null;
		int weight = 0, points = 0, response = 0;
		int i;
		
		Input input = new Input(); //declare new object from class Input to call methods
		
		Scanner sc = new Scanner(System.in); //scanner for response at first question
		
		Animal [] tableau = new Animal [3]; //declare empty array of 3 animals
			
			System.out.println("-------------------- ANIMAL DATABASE --------------------\n");
			for (i=0;i<3;i++) {
			do {
				System.out.print("\nChoose the type of animal you want to insert data :\n1 - Dog\n2 - Cow\nYour choice : ");
				response = sc.nextInt();
				if (response != 1 && response != 2) {System.out.println("Error - no valid choice");}
			} while (response != 1 && response != 2);

				if (response == 1) {
					name = input.setName();
					color = input.setColor();
					race = input.setRace();
					Dog dog = new Dog(name, color, points, race);
					tableau [i] = dog;
					}
			
				else {
					name = input.setName();
					color = input.setColor();
					weight = input.setWeight();
					Cow cow = new Cow(name, color, points, weight);
					tableau [i] = cow;
					}
			}
			System.out.println("\nRECAP CHART :\n");
			System.out.println("\nGOOD-BYE !");
			for(Animal v : tableau){System.out.println("\t" + v.toString());}
	}
}


	
	
