public class PlayerSelection {

    private int score;

    public PlayerSelection() {
        score = 0;
    }

    public void addPoint() {
        score++;
    }

    public boolean hasWon() {
        if (score >= 3) {
            return true;
        } else {
            return false;
        }
    }
}




