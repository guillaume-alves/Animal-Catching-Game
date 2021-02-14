import java.util.*;

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

	public void createPlayerTab(Player player1, Player player2) { // Create the tab that contains the users
		playerTab[0] = player1;
		playerTab[1] = player2;
	}

	public void createGameTab(Dog[] dogTab, Cow[] cowTab, int nbDog, int nbCow) {
		int nb5i = nbDog; // initial dog counter
		int nb10i = nbCow; // initial cow counter
		int i;

		Animal emptyAnimal = new Animal(null, null, 0);

		for (i = 0; i < nb5i; i++) gameTab.add(dogTab[i]);
		for (i = 0; i < nb10i; i++) gameTab.add(cowTab[i]);
		for (i = 0; i < ((nbRows * nbColumns) - (nb5i + nb10i)); i++) gameTab.add(emptyAnimal);

		//Shuffle the list
		Collections.shuffle(gameTab);

		/* // Print for test
		System.out.print("\n" +gameTab);*/
	}

	public void playerTurn(Player player, Dog [] dogTab, Cow [] cowTab, int rowToPlay, int columnToPlay) {
		int c;
		if (rowToPlay==0) c=0;
			else c=(rowToPlay-1);
		int j = ((c*nbColumns) + (columnToPlay-1));
		for (int i = 0; i < nbDog; i++) {
			if (gameTab.get(j) == dogTab[i]) {
				player.setPlayerScore(player.getPlayerScore()+5);
				player.enterAnimalIntoPlayerAnimalTab(dogTab[i]);
				gameTab.set(j, null);
				nbDog--;
			}
		}

		for (int i = 0; i < nbCow; i++) {
			if (gameTab.get(j) == cowTab[i]) {
				player.setPlayerScore(player.getPlayerScore()+10);
				player.enterAnimalIntoPlayerAnimalTab(cowTab[i]);
				gameTab.set(j, null);
				nbCow--;
			}
		}
	}
}