import java.util.ArrayList;

public class Player {
    protected String name;
    protected int score;
    ArrayList <Animal> playerAnimalTab = new ArrayList<>();

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public int getPlayerScore() {
        return score;
    }

    public void setPlayerScore(int score) {
        this.score = score;
    }

    public ArrayList<Animal> getPlayerAnimalTab() {
        return playerAnimalTab;
    }

    public void enterAnimalIntoPlayerAnimalTab(Animal animal) {
        playerAnimalTab.add(animal);
    }
}




