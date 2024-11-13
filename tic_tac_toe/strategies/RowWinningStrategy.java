package tic_tac_toe.strategies;

import tic_tac_toe.models.Board;
import tic_tac_toe.models.Cell;
import tic_tac_toe.models.CellState;
import tic_tac_toe.models.Move;
import tic_tac_toe.models.Player;

public class RowWinningStrategy implements WinningStrategy{
    public boolean checkWinner(Board board, Move lastMove){
        int row = lastMove.cell.row;
        Player player = lastMove.cell.player;
        for(int index = 0; index < board.size; index++){
            Cell cell = board.cells.get(row).get(index);
            if(cell.cellState != CellState.OCCUPIED || cell.player != player){
                return false;
            }
        }
        return true;
    }
}
