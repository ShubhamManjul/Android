package tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

import tic_tac_toe.controllers.GameController;
import tic_tac_toe.models.BotPlayer;
import tic_tac_toe.models.Game;
import tic_tac_toe.models.HumanPlayer;
import tic_tac_toe.models.Player;
import tic_tac_toe.strategies.ColumnWinningStrategy;
import tic_tac_toe.strategies.DiagonalWinningStrategy;
import tic_tac_toe.strategies.RowWinningStrategy;
import tic_tac_toe.strategies.WinningStrategy;

public class Main {
    public static void main(String[] args){
        GameController gameController = new GameController();
        Player humanPlayer = new HumanPlayer();
        Player botPlayer = new BotPlayer();
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());
        Game game = gameController.startGame(3, 
                                        List.of(humanPlayer, botPlayer), 
                                        null);
        System.out.println(game.board);

        
    }
}
