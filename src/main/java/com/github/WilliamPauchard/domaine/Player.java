package main.java.com.github.WilliamPauchard.domaine;

import main.java.com.github.WilliamPauchard.metier.ListDices;

/**
 *
 * @author william.pauchard
 */
public class Player {
    
    private static int cptLancer;
       private static final int MAX_TRIES = 3;
    
    public Player(int cptLancer){this.cptLancer = cptLancer;}
    
    private void throwDices(ListDices des) {
        des.throwDices();
        cptLancer++;
        System.out.println(des);
    }
    
    public void play(ListDices des) {
        while (nextThrow()) {
            throwDices(des);
        }
    }

    private boolean nextThrow() {
        return cptLancer < MAX_TRIES;
    }
}
