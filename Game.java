package Game;
import java.util.Arrays;

public class Game {
	int nbRows;
	int nbColumns;
	int x;
		
	public Game(int nbRows, int nbColumns) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
	}

	public void createTab() { // fill a multidimensional tab with data

		int nb5i = 2; //number of dog
		int nb10i = 3; // number of cow
		int nb5f = 0;
		int nb10f = 0;
		int x;

		int nbRows = this.nbRows;
		int nbColumns = this.nbColumns;
		int [][] multitab = new int [nbRows][nbColumns];

		for(int k=0; k<nbRows; k++) {

			for(int l=0; l<nbColumns; l++) {
				do {
					x = (int)(Math.random() * 11);
				} while (x != 0 &&  x != 5 && x != 10);
				if (x == 5 && nb5i>=0) {
					multitab[k][l] = x;
					nb5i--;
					nb5f++;
				}

				else if (x == 10 && nb10i>=0) {
					multitab[k][l] = x;
					nb10i--;
					nb10f++;
				}
				l++;}
			k++;}
	}

}