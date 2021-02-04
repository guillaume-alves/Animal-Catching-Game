package GamePackage;

public class Animal {
	protected String name;
	protected String color;
	protected int points;
	
	public Animal(String name, String color, int points) {
		this.name = name;
		this.color = color;
		this.points = points;
	}
	
	public String toString(){
	    return "NAME : " + this.name + " - COLOR : " + this.color;
	
	}
	
	
}

