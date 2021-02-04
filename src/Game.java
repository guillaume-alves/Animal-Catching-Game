public class Game {
	int nbRows;
	int nbColumns;
	int x;
		
	public Game(int nbRows, int nbColumns) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
	}

	public void createTab() { // create and fill a multidimensional tab with data - 100% working, testei com Visual Code Studio :)

		int nb5i = 2; //number of dog
		int nb10i = 3; // number of cow
		int nb5f = 0; // counter to check how many dogs have been put in the tab
		int nb10f = 0; // counter to check how many cows have been put in the tab
		int x;

		int nbRows = this.nbRows;
		int nbColumns = this.nbColumns;
		int [][] multitab = new int [nbRows][nbColumns]; // create the tab

		for(int k=0; k<nbRows; k++) {

			for(int l=0; l<nbColumns; l++) {
				do {
					x = (int)(Math.random() * 11);
				} while (x != 0 &&  x != 5 && x != 10); // Generate 0, 5 or 10 points
				if (x == 5 && nb5i>=0) {
					multitab[k][l] = x; // fill the cell
					nb5i--; // subtract one dog
					nb5f++;
				}

				else if (x == 10 && nb10i>=0) {
					multitab[k][l] = x; // fill the cell
					nb10i--; // subtract one cow
					nb10f++;
				}
				l++;} //index of the column
			k++;} // index of the row

		int j=0;
		for(int index1[] : multitab) {
			int i = 0;
			for(int index0 : index1) {
				System.out.println("Data registered at [" + j + "][" + i +"] is : " + multitab[j][i]);
				i++;
			}
			j++;
		}
		System.out.println("Number of dog in the game : " + nb5f);
		System.out.println("Number of dog left : " + nb5i);
		System.out.println("Number of cow in the game : " + nb10f);
		System.out.println("Number of cow left : " + nb10i);

	}

}
