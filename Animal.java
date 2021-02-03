package Game;
import java.util.Scanner;

public class Animal {
	
	Scanner input = new Scanner(System.in);
	protected String name;
	protected String color;
	protected int points;
	
	public Animal(String name, String color, int points) {
		this.name = name;
		this.color = color;
	}
	
	public String toString(){
	    return "NAME : " + this.name + " - COLOR : " + this.color;
	
	}
	
	
}

