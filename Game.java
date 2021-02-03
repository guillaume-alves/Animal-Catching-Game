package Game;
import java.util.Arrays;

public class Game {
	int nbRows;
	int nbColumns;
	int x;
	int [][] tab;
		
	public Game(int nbRows, int nbColumns) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
	}

	public void fillTab(int [][] tab) { // fill a multidimensional tab with data
	
	    // generate random numbers between 0, 5 and 10 
		int x;
		do {
			x = (int)(Math.random() * 11);
	        } while (x != 0 &&  x != 5 && x != 10);
			
		for (int [] row : tab) // fill the tab
			Arrays.fill(row, x);
	}

}