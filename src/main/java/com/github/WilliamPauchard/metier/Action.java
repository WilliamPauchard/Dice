package main.java.com.github.WilliamPauchard.metier;

/**
 * 
 * @author william.pauchard
 * 
 */

public class Action {

    public static final int DICES_THROWN = 1;

    private int action;

    public Action(int action) {
        this.action = action;
    }

    public int getAction() {
        return action;
    }
}
