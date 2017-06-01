package main.java.com.github.WilliamPauchard.presentation;

import main.java.com.github.WilliamPauchard.domaine.Player;
import main.java.com.github.WilliamPauchard.metier.ListDices;
/**
 * @author william.pauchard
 */
public class Game {
    private static final String VICTORY = "Gagné!", DEFEAT = "Perdu";
 
    private static boolean isWinningResult;
    private static Player player1;
    private static Player player2;

    public Game() {
        player1 = new Player(0);
        player2 = new Player(0);
        isWinningResult = false;
    }

    public void startGame() {
        ListDices des = initGame();
        player1.play(des);
        if(checkGameResult()){
            System.out.println("Player 1 : " + VICTORY);
        }else{
            player2.play(initGame());
            if(checkGameResult()){
                System.out.println("Player 2 : " + VICTORY);
            }else{
                startGame();
            }
        }
    }

    private boolean checkGameResult() {
        if(isWinningResult){
            return true;
        }
        return false;
    }

    private ListDices initGame() {
        return new ListDices(new ListDicesObserver(this));
    }

    

    public void setResult(boolean result) {
        isWinningResult = result;
    }
}
