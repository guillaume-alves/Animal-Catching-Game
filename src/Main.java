public class Main {
    public static void main(String[] args) {
        String name, color, race;
        int points, weight;
        int x=0;
        Input input = new Input(); //declare new object from class Input to call methods

        // Define players and reset scores
        input.playerMessage();
        input.setPlayerName(1);
        Player player1 = new Player(input.getPlayerName(1));
        player1.setPlayerScore(0);
        input.setPlayerName(2);
        Player player2 = new Player(input.getPlayerName(2));
        player2.setPlayerScore(0);

        // Ask for the size of the grid
        input.gridMessage();
        input.setNbRowsInit();
        input.setNbColumnsInit();

        // Ask for number of animals
        input.animalMessage();
        input.setNbDog();
        input.setNbCow();

        // Declare new object from class Input to call methods
        Game game = new Game(input.getNbRowsInit(), input.getNbColumnsInit(), input.getNbDog(), input.getNbCow());
        game.createPlayerTab();

        // Create an array of animals
        Dog [] dogTab = new Dog [input.getNbDog()];
        Cow [] cowTab = new Cow [input.getNbCow()];
        int i;
        for (i=0;i<input.getNbDog();i++) {
            input.dogMessage();
            System.out.print((i+1) + "\n");
            input.setAnimalName();
            input.setAnimalColor();
            input.setAnimalRace();
            points = 5;
            Dog dog = new Dog(input.getAnimalName(), input.getAnimalColor(), points, input.getAnimalRace());
            dogTab[i] = dog;
        }
        for (i=0;i<input.getNbCow();i++) {
            input.cowMessage();
            System.out.print((i+1) + "\n");
            input.setAnimalName();
            input.setAnimalColor();
            input.setAnimalWeight();
            points = 10;
            Cow cow = new Cow(input.getAnimalName(), input.getAnimalColor(), points, input.getAnimalWeigh());
            cowTab[i] = cow;
        }

        // Create the gameTab
        game.createGameTab(dogTab, cowTab, input.getNbDog(), input.getNbCow());

        // One play cycle

        for (i=0;i<(game.getNbDog()+game.getNbCow());i++) {
            player1.getPlayerName(); // Player 1 turn
            do {
                input.setRowToPlay();
                input.setColumnToPlay();
            } while (input.getRowToPlay()>input.getNbRowsInit() && input.getColumnToPlay()>input.getNbColumnsInit());
            game.playerTurn(1, dogTab, cowTab, input.getRowToPlay(), input.getColumnToPlay());

            player2.getPlayerName(); // Player 2 turn
            do {
                input.setRowToPlay();
                input.setColumnToPlay();
            } while (input.getRowToPlay()>input.getNbRowsInit() && input.getColumnToPlay()>input.getNbColumnsInit());

            game.playerTurn(1, dogTab, cowTab, input.getRowToPlay(), input.getColumnToPlay());

        }
    }
}