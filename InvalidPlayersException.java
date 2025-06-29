package TicTacToeCompleteGame;

public class InvalidPlayersException extends RuntimeException {
    public InvalidPlayersException() {
        super("Invalid list of players!");
    }
}