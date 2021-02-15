import java.util.*;

public class Game {
	int nbRows, nbColumns, nbDog, nbCat;
	Player[] playerTab = new Player[2];
	ArrayList<Animal> gameTab = new ArrayList<Animal>();

	public Game(int nbRows, int nbColumns, int nbDog, int nbCat) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
		this.nbDog = nbDog;
		this.nbCat = nbCat;

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

	public int getNbDog() {
		return nbDog;
	}

	public void setNbDog(int nbDog) {
		this.nbDog = nbDog;
	}

	public int getNbCat() {
		return nbCat;
	}

	public void setNbCat(int nbCat) {
		this.nbCat = nbCat;
	}

	public void createPlayerTab(Player player1, Player player2) { // Create the tab that contains the users
		playerTab[0] = player1;
		playerTab[1] = player2;
	}

	public void createGameTab(Dog[] dogTab, Cat[] catTab, int nbDog, int nbCat) {
		int nb5i = nbDog; // initial dog counter
		int nb10i = nbCat; // initial cat counter
		int i;

		Animal emptyAnimal = new Animal(null, null, 0);

		for (i = 0; i < nb5i; i++) gameTab.add(dogTab[i]);
		for (i = 0; i < nb10i; i++) gameTab.add(catTab[i]);
		for (i = 0; i < ((nbRows * nbColumns) - (nb5i + nb10i)); i++) gameTab.add(emptyAnimal);

		//Shuffle the list
		Collections.shuffle(gameTab);

		// Print for test
		//System.out.print("\n" +gameTab);
	}

	public void playerTurn(Player player, Dog[] dogTab, Cat[] catTab, int rowToPlay, int columnToPlay, String [][] virtualTab) {
		int c;
		if (rowToPlay == 0) c = 0;
		else c = (rowToPlay - 1);
		int j = ((c * nbColumns) + (columnToPlay - 1));
		for (int i = 0; i < nbDog; i++) {
			if (gameTab.get(j) == dogTab[i]) {
				player.setPlayerScore(player.getPlayerScore() + 5);
				player.enterAnimalIntoPlayerAnimalTab(dogTab[i]);
				gameTab.set(j, null);
				nbDog--;
				virtualTab[rowToPlay-1][columnToPlay-1] = "D";
				System.out.print("You have caught a dog !\n");
			}
		}

		for (int i = 0; i < nbCat; i++) {
			if (gameTab.get(j) == catTab[i]) {
				player.setPlayerScore(player.getPlayerScore() + 10);
				player.enterAnimalIntoPlayerAnimalTab(catTab[i]);
				gameTab.set(j, null);
				nbCat--;
				virtualTab[rowToPlay-1][columnToPlay-1] = "C";
				System.out.print("You have caught a cat !\n");
			}
		}
	}

	public void fillVirtualTab(String [][] virtualTab) {
		for (int j = 0; j < nbColumns; j++) {
			for (int i = 0; i < nbRows; i++) {
				virtualTab[i][j] = "-";
			}
		}
	}

	public void fillVirtualTabPlayer(String [][] virtualTab, int player,int rowToPlay, int columnToPlay) {
				if (player == 1) virtualTab[rowToPlay-1][columnToPlay-1] = "X";
				else virtualTab[rowToPlay-1][columnToPlay-1] = "O";
			}

	public void printVirtualTab(String [][] virtualTab) {
		System.out.print("\n");
		for (int j = 0; j < nbColumns; j++) {
			System.out.print("\t" + (j+1));
		}
		System.out.print("\n");
		for (int i = 0; i < nbRows; i++) {
			System.out.print((i+1)+" | ");
			for (int j = 0; j < nbColumns; j++) {
				System.out.print(virtualTab[i][j] + " | ");
				if (j==nbColumns-1) System.out.println();
			}
		}
	}
}