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

	public void createTab() { // create and fill a multidimensional tab with data - 100% working, testei com progrmma anexo :)

		int nb5i = 2; //number of dog - Como posso fazer o link com a class Dog ?
		int nb10i = 3; // number of cow - Como posso fazer o link com a class Cow ?
		int nb5f = 0; // counter para verificar que os dogs foram bem introduzido na tab
		int nb10f = 0; // same thing
		int x;

		int nbRows = this.nbRows;
		int nbColumns = this.nbColumns;
		int [][] multitab = new int [nbRows][nbColumns]; // create the tab

		for(int k=0; k<nbRows; k++) {

			for(int l=0; l<nbColumns; l++) {
				do {
					x = (int)(Math.random() * 11);
				} while (x != 0 &&  x != 5 && x != 10); // Generate 0, 5 or 10
				if (x == 5 && nb5i>=0) {
					multitab[k][l] = x; // fill the cell
					nb5i--; // substract one dog
					nb5f++;
				}

				else if (x == 10 && nb10i>=0) {
					multitab[k][l] = x; // fill the cell
					nb10i--; // substract one cow
					nb10f++;
				}
				l++;} //index of the column
			k++;} // index of the row
	}

}