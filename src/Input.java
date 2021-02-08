import java.util.Scanner;

public class Input {
	Scanner input = new Scanner(System.in);
	private String n, c, r, player;
	private int x, w, nbRowsInit, nbColumnsInit, rowToPlay, columnToPlay, nbDog, nbCow, nbAnimal, choice;

	public void setPlayerName(int x) {
		System.out.print("\tEnter player " + x + " name : ");
		this.player = input.nextLine();
	}

	public String getPlayerName(int x) {
		return player;
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

	public void setRowToPlay() { //Ask for a number of columns
		System.out.print("Choose the row to play : ");
		this.rowToPlay = Integer.parseInt(input.nextLine());

	}

	public void setColumnToPlay() { //Ask for a number of columns
		System.out.print("Choose the row to play : ");
		this.columnToPlay = Integer.parseInt(input.nextLine());

	}

	public int getRowToPlay(){
		return rowToPlay = rowToPlay;
	}

	public int getColumnToPlay(){
		return columnToPlay = columnToPlay;
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
