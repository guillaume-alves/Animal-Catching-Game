import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Input input = new Input(); //declare new object from class Input to call methods

        Scanner sc = new Scanner(System.in); //scanner for response at first question
        input.setNbRows();
        input.setNbColumns();
        
        Game game = new Game(input.getRo(), input.getCo()); //declare new object from class Input to call methods

        game.createTab(); // Generate tab

    }
}