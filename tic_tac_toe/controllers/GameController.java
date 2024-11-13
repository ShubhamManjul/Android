package tic_tac_toe.controllers;

import java.util.List;

import tic_tac_toe.models.Board;
import tic_tac_toe.models.Game;
import tic_tac_toe.models.GameState;
import tic_tac_toe.models.Player;
import tic_tac_toe.strategies.WinningStrategy;

public class GameController {
    public Game startGame(int dimension, List<Player> players, 
                            List<WinningStrategy> winningStrategies){

        return Game.getBuilder()
            .setBoard(new Board(dimension))
            .setGameState(GameState.INITIALISING)
            .setCurrentPlayer(null)
            .setMoves(null)
            .setPlayers(players)
            .setWinningStrategies(winningStrategies)
            .build();
    }

    public String displayBoard(Game game){
        return game.board.toString();
    }

    public GameState getGameState(Game game){
        return game.gameState;
    }

    
}
