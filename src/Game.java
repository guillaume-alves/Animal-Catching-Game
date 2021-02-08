import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
	int nbRows, nbColumns, nbDog, nbCow;
	Player[] playerTab = new Player[2];
	ArrayList<Animal> gameTab = new ArrayList<Animal>();

	public Game(int nbRows, int nbColumns, int nbDog, int nbCow) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
		this.nbDog = nbDog;
		this.nbCow = nbCow;
	}

	public int getGameNbRows() {
		return nbRows;
	}

	public void setGameNbRows(int nbRows) {
		this.nbRows = nbRows;
	}

	public int getGameNbColumns() {
		return nbColumns;
	}

	public void setGameNbColumns(int nbColumns) {
		this.nbColumns = nbColumns;
	}

	public int getNbDog() {	return nbDog; }

	public void setNbDog(int nbDog) { this.nbDog = nbDog; }

	public int getNbCow() {	return nbCow; }

	public void setNbCow(int nbCow) { this.nbCow = nbCow; }

	public void createPlayerTab() { // Create the tab that contains the users
		Player[] playerTab = new Player[2];
	}

	public void createGameTab(Dog[] dogTab, Cow[] cowTab, int nbDog, int nbCow) {
		int nb5i = nbDog; // initial dog counter
		int nb10i = nbCow; // initial cow counter
		int nb5f = 0; // final dog counter
		int nb10f = 0; // final dog counter
		int i;

		Animal emptyAnimal = new Animal(null, null, 0);

		for (i = 0; i < nb5i; i++) {
			gameTab.add(dogTab[i]);
			for (i = 0; i < nb10i; i++) {
				gameTab.add(cowTab[i]);
				for (i = 0; i < ((nbRows * nbColumns) - (nb5i + nb10i)); i++) {
					gameTab.add(emptyAnimal);
				}
			}
		}

		//Shuffle the list
		Collections.shuffle(gameTab);

		// Print the table
		System.out.println(gameTab);
	}
}