package tic_tac_toe.models;
import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public List<List<Cell>> cells;

    public Board(int size){
        this.size = size;
        cells = new ArrayList<>();
        for(int row = 0; row < size; row++){
            cells.add(new ArrayList<>());
            for(int col = 0; col < size; col++){
                cells.get(row).add(new Cell(row, col));
            }
        }
    }

    public String toString(){
        StringBuilder board = new StringBuilder();

        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                Cell cell = cells.get(row).get(col);
                if (cell.cellState == CellState.FREE){
                    board.append("|   |");
                } else {
                    board.append(String.format("| %c |", cell.player.symbol));
                }
            }
            board.append("\n\n");
        }
        return board.toString();
    }
}
