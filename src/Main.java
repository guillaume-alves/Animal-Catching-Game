public class Main {
    public static void main(String[] args) {
        String name, color, race;
        int points, weight;
        int x=0;
        Input input = new Input(); //declare new object from class Input to call methods

        // Ask for player's names
        input.playerMessage();
        input.setPlayerOneName();
        input.setPlayerTwoName();

        // Declare new object from class Input to call methods
        Game game = new Game(input.getNbRowsInit(), input.getNbColumnsInit());

        // Define players and reset scores
        Player user1 = new Player(input.getPlayerOneName(), 0);
        Player user2 = new Player(input.getPlayerTwoName(), 0);
        game.createPlayerTab(user1, user2);

        // Ask for the size of the grid
        input.gridMessage();
        input.setNbRowsInit();
        input.setNbColumnsInit();

        // Ask for number of animals
        input.animalMessage();
        input.setNbDog();
        input.setNbCow();

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
        for (i=0;i<input.getNbDog();i++) {
                input.cowMessage();
                System.out.print((i+1) + "\n");
                input.setAnimalName();
                input.setAnimalColor();
                input.setAnimalWeight();
                points = 10;
                Cow cow = new Cow(input.getAnimalName(), input.getAnimalColor(), points, input.getAnimalWeigh());
                cowTab[i] = cow;
            }

        Animal [][] gameTab = new Animal [game.getGameNbRows()][game.getGameNbColumns()];
        
        game.createGameTab(dogTab, cowTab, gameTab, input.getNbDog(), input.getNbCow());

        // Play turn
        input.playerOneTurn();
        input.setNbColToPlay();
        input.setNbColToPlay();

    }

}