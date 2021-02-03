package Game;

public class Cow extends Animal {
	
	private int weight;
	
	public Cow (String name, String color, int weight, int points){
		super(name, color, points);
		this.weight = weight;
		setPoints();
	}
	
	public void setPoints(){
		this.points = 10;
	}
	
	public String toString(){
	    String str = super.toString() + " - WEIGHT : " + this.weight + " Kg";
	    return str;
	}
	
}
