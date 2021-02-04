package Game;

import java.util.Scanner;

public class Input {
	Scanner input = new Scanner(System.in); 
	private String n, c, r;
	private int w, ro, co;
	int[][] multiTab;
	
	public String setName() {
		System.out.print("Enter animal name : ");
		this.n = input.nextLine();
		return this.n;
	}
	
	public String setColor() {
		System.out.print("Enter animal color : ");
		this.c = input.nextLine();
		return this.c;
	}
	
	public String setRace() {
		System.out.print("Enter animal race : ");
		this.r = input.nextLine();
		return this.r;
	}
	
	public int setWeight() {
		System.out.print("Enter animal weight : ");
		this.w = Integer.parseInt(input.nextLine());
		return this.w;
	}
	
	public int setNbRows() { //Ask for a number of rows
		System.out.print("Enter the number of Rows :");
		this.ro = Integer.parseInt(input.nextLine());
		return this.ro;
	}
	
	
	public int setNbColumns() { //Ask for a number of columns
		System.out.print("Enter the number of Columns :");
		this.co = Integer.parseInt(input.nextLine());
		return this.co;
	}

}
