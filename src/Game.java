public class Game {
	int nbRows, nbColumns;
	int x;


	public Game(int nbRows, int nbColumns) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
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

	public void createPlayerTab(Player user1, Player user2) { // Create the tab that contains the users
		Player[] userTab = new Player[2];
		userTab[0] = user1;
		userTab[1] = user2;

		// Print the table
		int i = 0;
		for (Player index0 : userTab) {
			System.out.println("Data registered at [" + i + "] is : " + (userTab[i]));
			i++;
		}
		System.out.println("Welcome " + user1.getPlayerName() + " and " + user2.getPlayerName());
		System.out.println("Welcome " + user1.getPlayerName() + " and " + user2.getPlayerName());
	}

	public void createGameTab(Dog [] dogTab, Cow [] cowTab, Animal [][] gameTab, int NbDog, int NbCow) {
		int nb5i = NbDog; // initial dog counter
		int nb10i = NbCow; // initial cow counter
		int nb5f = 0; // final dog counter
		int nb10f = 0; // final dog counter
		int x;

		do {
			nb10i = NbCow; // Reset initial dog counter
			nb10f = 0; // Reset initial dog counter
			nb5i = NbDog; // Reset final dog counter
			nb5f = 0; // Reset final dog counter
			int c = 0, d = 0;

			for (int k = 0; k < nbRows; k++) {
				for (int l = 0; l < nbColumns; l++) {
					do {
						x = (int) (Math.random() * 11);
					} while (x != 0 && x != 5 && x != 10); // Generate 0, 5 or 10 points

					if (x == 5 && nb5i > 0) {
						gameTab[k][l] = dogTab[d]; // fill the cell
						d++;
						nb5i--; // Subtract one dog to the initial counter
						nb5f++; // Add one dog to the final counter

					} else if (x == 10 && nb10i > 0) {
						gameTab[k][l] = cowTab[c]; // fill the cell
						c++;
						nb10i--; // subtract one cow to the initial counter
						nb10f++; // Add one cow to the final counter
					}
				}
			}
		} while (nb5f != NbDog && nb10f != NbCow); //Repeat while all dogs and cow are in the table

		// Print the table
		int j = 0;
		for (Animal index1[] : gameTab) {
			int i = 0;
			for (Animal index0 : index1) {
				System.out.println("Data registered at [" + j + "][" + i + "] is : " + gameTab[j][i]);
				i++;
			}
			j++;
		}
		System.out.println("Number of dog in the game : " + nb5f);
		System.out.println("Number of dog left : " + nb5i);
		System.out.println("Number of cow in the game : " + nb10f);
		System.out.println("Number of cow left : " + nb10i);


		//if (gameTab[0][1] == 5) System.out.println("Vache trouvée ! --> 10 points");
		//else if (gameTab[0][1] == 10) System.out.println("Vache trouvée ! --> 10 points");
	}

}
