package main.java.com.github.WilliamPauchard.domaine;

class Die {

    private final int MAX = 6;  // maximum face value

    private int faceValue;  // current value showing on the die

    //-----------------------------------------------------------------
    //  Constructor: Sets the initial face value.
    //-----------------------------------------------------------------
    public Die() {
        faceValue = 1;
    }

    // Alternate Constructor
    public Die(int value) {
        faceValue = value;
    }

    //-----------------------------------------------------------------
    //  Rolls the die and returns the result.
    //-----------------------------------------------------------------
    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;

        return faceValue;
    }

    //-----------------------------------------------------------------
    //  Face value mutator.
    //-----------------------------------------------------------------
    public void setFaceValue(int value) {
        faceValue = value;
    }

    //-----------------------------------------------------------------
    //  Face value accessor.
    //-----------------------------------------------------------------
    public int getFaceValue() {
        return faceValue;
    }

// Returns a string representation of this die. 
    public String toString() {
        String result = Integer.toString(faceValue);
        return result;
    }

}

public class oldDice2 {

    //-----------------------------------------------------------------
    //  Creates two Die objects and rolls them several times.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        Die die1, die2, die3;

        die1 = new Die();
        die2 = new Die();
        die3 = new Die();

        die1.roll();
        die2.roll();
        die3.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2 + " Die Three : " + die3);

        die1.roll();
        die2.roll();
        die3.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2 + " Die Three : " + die3);

        die1.roll();
        die2.roll();
        die3.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2 + " Die Three : " + die3);
    }
}
