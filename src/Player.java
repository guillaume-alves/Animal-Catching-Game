public class Player {
    protected String name;
    protected int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
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
}



