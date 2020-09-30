package guessgame;

public class GuessMachine {

    private int number;
    private int numGuess;
    private String giveResult;

    public GuessMachine() {
        numGuess = 0;
        number = (int) (Math.random() % 100) + 1;
    }

    public boolean guessNumber(int num) {
        numGuess++;
        if (num == number) {
            return true;
        } else {
            return false;
        }
    }

    public String giveResult(int num) {
        if (number == number) {
            return "You got it!";
        } else if (num < number) {
            return "Too low. Try again!";
        }
        else return "Too high.";
    }
    

}
