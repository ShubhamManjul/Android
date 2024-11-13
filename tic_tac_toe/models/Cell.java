package tic_tac_toe.models;

public class Cell {
    public Player player;
    public CellState cellState;
    public int row;
    public int column;

    public Cell(int row, int col){
        this.row = row;
        this.column = col;
        this.cellState = CellState.FREE;
    }
}
