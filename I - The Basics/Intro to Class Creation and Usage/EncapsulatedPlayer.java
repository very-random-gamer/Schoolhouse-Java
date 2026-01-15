public class EncapsulatedPlayer {

    private int score;

    public EncapsulatedPlayer() {
        score = 0;
    }

    public void addPoint() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
