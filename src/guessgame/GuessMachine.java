package guessgame;

public class GuessMachine {

    private int number;
    private int setGuess;
    private int myGuess;

    public GuessMachine() {
        setGuess = 0;
        number = (int) (Math.random() * 100) + 1;
        myGuess = 0;
    }

    public boolean setGuess(int num) {
        if (num > 100 || num < 0) {
            return false;
        }
        myGuess = num;
        setGuess++;

        return true;
    }
}
