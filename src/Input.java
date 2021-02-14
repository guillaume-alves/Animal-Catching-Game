import java.util.ArrayList;
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
		System.out.print("\tEnter the name of the animal : ");
		this.n = input.nextLine();
	}

	public String getAnimalName() {
		return n;
	}

	public void setAnimalColor() { //Ask for the color
		System.out.print("\tEnter the color of the animal : ");
		this.c = input.nextLine();
	}

	public String getAnimalColor() {
		return c;
	}

	public void setAnimalRace() { //Ask for the race of the dog
		System.out.print("\tEnter the race of the dog : ");
		this.r = input.nextLine();
	}

	public String getAnimalRace() {
		return r;
	}

	public void setAnimalWeight() { //Ask for the weight of the cow
		System.out.print("\tEnter the weight of the cow (Kg) : ");
		this.w = Integer.parseInt(input.nextLine());
	}

	public int getAnimalWeigh() {
		return w;
	}

	public void setNbRowsInit() { //Ask for a number of rows
		System.out.print("\tEnter the number of rows fo the grid : ");
		this.nbRowsInit = Integer.parseInt(input.nextLine());
	}

	public int getNbRowsInit() {
		return nbRowsInit;
	}

	public void setNbColumnsInit() { //Ask for a number of columns
		System.out.print("\tEnter the number of columns of the grid : ");
		this.nbColumnsInit = Integer.parseInt(input.nextLine());
	}

	public int getNbColumnsInit() {
		return nbColumnsInit;
	}

	public void setRowToPlay() { //Ask for a number of columns
		System.out.print("Choose the row to play (starting from 1) : ");
		this.rowToPlay = Integer.parseInt(input.nextLine());
	}

	public void setColumnToPlay() { //Ask for a number of columns
		System.out.print("Choose the column to play (starting from 1) : ");
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

	public void introMessage() {
		System.out.print("***** WELCOME TO THE ANIMAL CATCHING GAME ! *****\n");
		System.out.print("- In this 2 players game you will have to catch animals (dog or cow) in a grid (row x columns).\n" +
				"- The parameters of the game (number of animals, features, size of the grid) are previously set by you !\n" +
				"- The grid randomly generated with the animals and empty cells.\n"+
				"- On you turn, you have to choose one cell with its coordinates (number of the row and column)\n" +
				"- You will earn 10 points for catching a cow, 5 for a cow and 0 if you pick an empty cell.\n" +
				"- The winner is the one with the most points at the end of the game.\n");
	}

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

	public void playerTurn(String player) {
		System.out.print("\n" + player + ", it's your turn to play !\n");
	}

	public void rowErrorMessage() {	System.out.print("\nError : invalid row number !\n"); }

	public void columnErrorMessage() {
		System.out.print("\nError : invalid column number !\n");
	}

	public void scoreRecapMessage(String player, int score) {
		System.out.print(player + ", your score is : " + score + "\n");
	}

	public void animalRecapMessage(String player, ArrayList<Animal> playerAnimalTab, int playerscore) {
		System.out.print(player + ", the animals you have caught are : " + playerAnimalTab + " * TOTAL SCORE : " + playerscore + "\n");
	}

	public void endMessage(String player) {
		System.out.print("\nThe game is over ! " + player + " has won !\n");
	}


}
