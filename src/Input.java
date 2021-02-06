import java.util.Scanner;

public class Input {
	Scanner input = new Scanner(System.in);
	private String n, c, r, player1, player2;
	private int w, nbRowsInit, nbColumnsInit, nbRowToPlay, nbColToPlay, nbDog, nbCow, nbAnimal, choice;

	public void setPlayerOneName() {
		System.out.print("\tEnter player 1 name : ");
		this.player1 = input.nextLine();
	}

	public String getPlayerOneName() {
		return player1;
	}

	public void setPlayerTwoName() {
		System.out.print("\tEnter player 2 name : ");
		this.player2 = input.nextLine();
	}

	public String getPlayerTwoName() {
		return player2;
	}

	public void setAnimalName() { //Ask for the animal name
		System.out.print("\tEnter animal name : ");
		this.n = input.nextLine();
	}

	public String getAnimalName() {
		return n;
	}

	public void setAnimalColor() { //Ask for the color
		System.out.print("\tEnter animal color : ");
		this.c = input.nextLine();
	}

	public String getAnimalColor() {
		return c;
	}

	public void setAnimalRace() { //Ask for the race of the dog
		System.out.print("\tEnter animal race : ");
		this.r = input.nextLine();
	}

	public String getAnimalRace() {
		return r;
	}

	public void setAnimalWeight() { //Ask for the weight of the cow
		System.out.print("\tEnter animal weight : ");
		this.w = Integer.parseInt(input.nextLine());
	}

	public int getAnimalWeigh() {
		return w;
	}

	public void setNbRowsInit() { //Ask for a number of rows
		System.out.print("\tEnter the number of Rows : ");
		this.nbRowsInit = Integer.parseInt(input.nextLine());
	}

	public int getNbRowsInit() {
		return nbRowsInit;
	}

	public void setNbColumnsInit() { //Ask for a number of columns
		System.out.print("\tEnter the number of Columns : ");
		this.nbColumnsInit = Integer.parseInt(input.nextLine());
	}

	public int getNbColumnsInit() {
		return nbColumnsInit;
	}

	public void setNbRowToPlay() { //Ask for a number of columns
		System.out.print("Choose the row to play : ");
		this.nbRowToPlay = Integer.parseInt(input.nextLine());

	}

	public void setNbColToPlay() { //Ask for a number of columns
		System.out.print("Choose the row to play :");
		this.nbColToPlay = Integer.parseInt(input.nextLine());

	}

	public void setNbRowToPlay(int nbRowToPlay) {
		this.nbRowToPlay = nbRowToPlay;
	}

	public void setNbColToPlay(int nbColToPlay) {
		this.nbColToPlay = nbColToPlay;
	}

	public void playerOneTurn() {
		System.out.print("Player one turn !");
	}

	public void playerTwoTurn() {
		System.out.print("Player two turn !");
	}

	public void setNbDog() {
		System.out.print("\tHow many Dog do you want to add ? ");
		this.nbDog = Integer.parseInt(input.nextLine());
	}

	public int getNbDog() {
		return nbDog;
	}

	public void setNbCow() {
		System.out.print("\tHow many Cow do you want to add ? ");
		this.nbCow = Integer.parseInt(input.nextLine());
	}

	public int getNbCow() {
		return nbCow;
	}

	public void setNbAnimal() {
		System.out.print("\tHow many Animal do you want to add ? ");
		this.nbAnimal = Integer.parseInt(input.nextLine());
	}

	public int getNbAnimal() {
		return nbAnimal;
	}

	/*public int getChoiceAnimal(){
		do {
			System.out.print("\nChoose the type of animal you want to insert data :\n1 - Dog\n2 - Cow\nYour choice : ");
			this.choice = Integer.parseInt(input.nextLine());
			if (this.choice != 1 && this.choice != 2) {System.out.println("Error - no valid choice");}
		} while (this.choice != 1 && this.choice != 2);
			return choice;
	}*/

	public void playerMessage() {
		System.out.print("\nStep 1 : Enter the player's name\n");
	}

	public void gridMessage() {
		System.out.print("\nStep 2 : Size the game grid\n");
	}

	public void animalMessage() {
		System.out.print("\nStep 3 : Number of animals to find\n");
	}

	public void dogMessage() {
		System.out.print("\nStep 4 : Add the dog number ");
	}

	public void cowMessage() {
		System.out.print("\nStep 5 : Add the cow number ");
	}

}
