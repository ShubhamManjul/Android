package tic_tac_toe.strategies;

import tic_tac_toe.models.Board;
import tic_tac_toe.models.Cell;
import tic_tac_toe.models.CellState;
import tic_tac_toe.models.Move;
import tic_tac_toe.models.Player;

public class ColumnWinningStrategy implements WinningStrategy{
    public boolean checkWinner(Board board, Move lastMove){
        int col = lastMove.cell.column;
        Player player = lastMove.cell.player;
        for(int index = 0; index < board.size; index++){
            Cell cell = board.cells.get(index).get(col);
            if(cell.cellState != CellState.OCCUPIED || cell.player != player){
                return false;
            }
        }
        return true;
    }
}
