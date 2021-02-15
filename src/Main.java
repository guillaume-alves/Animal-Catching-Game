public class Main {
    public static void main(String[] args) {
        String name, color, race;
        int points, weight;
        int x=0;
        Input input = new Input(); //declare new object from class Input to call methods
 
        // Introduction message
        input.introMessage();

        // Define players and reset scores
        input.playerMessage();
        input.setPlayerName(1);
        Player player1 = new Player(input.getPlayerName(1));
        input.setPlayerName(2);
        Player player2 = new Player(input.getPlayerName(2));

        // Ask for the size of the grid
        input.gridMessage();
        input.setNbRowsInit();
        input.setNbColumnsInit();

        // Ask for number of animals
        input.animalMessage();
        input.setNbDog();
        input.setNbCat();

        // Declare new object from class Input to call methods
        Game game = new Game(input.getNbRowsInit(), input.getNbColumnsInit(), input.getNbDog(), input.getNbCat());
        game.createPlayerTab(player1, player2);
        String [][] virtualTab = new String [game.getGameNbRows()][game.getGameNbColumns()];
        game.fillVirtualTab(virtualTab);
        game.printVirtualTab(virtualTab);

        // Create an array of animals
        Dog [] dogTab = new Dog [input.getNbDog()];
        Cat[] catTab = new Cat[input.getNbCat()];
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
        for (i=0;i<input.getNbCat();i++) {
            input.catMessage();
            System.out.print((i+1) + "\n");
            input.setAnimalName();
            input.setAnimalColor();
            input.setAnimalWeight();
            points = 10;
            Cat cat = new Cat(input.getAnimalName(), input.getAnimalColor(), points, input.getAnimalWeigh());
            catTab[i] = cat;
        }

        // Create the gameTab
        game.createGameTab(dogTab, catTab, input.getNbDog(), input.getNbCat());

        // A full play cycle (player 1 and 2)
        do{
           // Player 1 turn
            input.playerTurn(player1.getPlayerName());
            do {
                input.setRowToPlay();
                    if (input.getRowToPlay()>input.getNbRowsInit() || input.getRowToPlay()<1) {
                        input.rowErrorMessage();
                    }
            } while (input.getRowToPlay()>input.getNbRowsInit() || input.getRowToPlay()<1);;
            do{
                input.setColumnToPlay();
                    if (input.getColumnToPlay()>input.getNbColumnsInit() || input.getColumnToPlay()<1) {
                        input.columnErrorMessage();
                    }
            } while (input.getColumnToPlay()>input.getNbColumnsInit() || input.getColumnToPlay()<1);

            game.playerTurn(player1, dogTab, catTab, input.getRowToPlay(), input.getColumnToPlay());
            game.fillVirtualTabP1(virtualTab, 1, input.getRowToPlay(), input.getColumnToPlay());
            game.printVirtualTab(virtualTab);// End of player 1 turn

            // Player 2 turn
            input.playerTurn(player2.getPlayerName());
            do {
                input.setRowToPlay();
                if (input.getRowToPlay()>input.getNbRowsInit() || input.getRowToPlay()<1) {
                    input.rowErrorMessage();
                }
            } while (input.getRowToPlay()>input.getNbRowsInit() || input.getRowToPlay()<1);;
            do{
                input.setColumnToPlay();
                if (input.getColumnToPlay()>input.getNbColumnsInit() || input.getColumnToPlay()<1) {
                    input.columnErrorMessage();
                }
            } while (input.getColumnToPlay()>input.getNbColumnsInit() || input.getColumnToPlay()<1);

            game.playerTurn(player2, dogTab, catTab, input.getRowToPlay(), input.getColumnToPlay());
            game.fillVirtualTabP1(virtualTab, 2, input.getRowToPlay(), input.getColumnToPlay());
            game.printVirtualTab(virtualTab); // End of player 2 turn

        } while((game.getNbDog()+ game.getNbCat()) != 0);

        if (player1.getPlayerScore()>player2.getPlayerScore()) input.endMessage(player1.getPlayerName());
            else input.endMessage(player2.getPlayerName());

        input.animalRecapMessage(player1.getPlayerName(),player1.getPlayerAnimalTab(),player1.getPlayerScore());
        input.animalRecapMessage(player2.getPlayerName(),player2.getPlayerAnimalTab(),player2.getPlayerScore());
    }
}