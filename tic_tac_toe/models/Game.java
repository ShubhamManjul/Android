package tic_tac_toe.models;

import java.util.List;

import tic_tac_toe.strategies.WinningStrategy;

public class Game {
    Board board;
    List<Player> players;
    List<WinningStrategy> winningStrategies;
    List<Move> moves;
    Player currentPlayer;
    GameState gameState;

    public static Builder getBuilder(){
        return new Builder(); 
    }

    private Game(Builder builder){
        validate(builder);
        this.board = builder.board;
        this.gameState = builder.gameState;
        this.currentPlayer = builder.currentPlayer;
        this.players = builder.players;
        this.moves = builder.moves;
        this.winningStrategies = builder.winningStrategies;
    }

    private static void validate(Builder builder){
        // 1. All players have different symbols.
        // 2. Only one bot player allowed in the game. 
        // 3. Minimum 2 players to play the game.
        // 4. N > 1
    }

    public static class Builder{
        Board board;
        List<Player> players;
        List<WinningStrategy> winningStrategies;
        List<Move> moves;
        Player currentPlayer;
        GameState gameState;
        Game build(){
            return new Game(this);
        }
        public Board getBoard() {
            return board;
        }
        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }
        public List<Player> getPlayers() {
            return players;
        }
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }
        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public List<Move> getMoves() {
            return moves;
        }
        public Builder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }
        public Player getCurrentPlayer() {
            return currentPlayer;
        }
        public Builder setCurrentPlayer(Player currentPlayer) {
            this.currentPlayer = currentPlayer;
            return this;
        }
        public GameState getGameState() {
            return gameState;
        }
        public Builder setGameState(GameState gameState) {
            this.gameState = gameState;
            return this;
        }
        
    }
}
