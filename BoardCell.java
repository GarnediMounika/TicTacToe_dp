package TicTacToeCompleteGame;

import lombok.*;



@AllArgsConstructor
@Getter
@Setter
public class BoardCell {
    private int row;
    private int column;
    private GameSymbol symbol;

    public BoardCell(int row, int column) {
        this.row = row;
        this.column = column;
    }
}