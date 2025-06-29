package TicTacToeCompleteGame;


public interface WinningStrategy {

    boolean checkWinner(Board board, GameSymbol symbol);
}
