package tic_tac_toe.strategies;
import tic_tac_toe.models.Board;
import tic_tac_toe.models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move lastMove);
}
