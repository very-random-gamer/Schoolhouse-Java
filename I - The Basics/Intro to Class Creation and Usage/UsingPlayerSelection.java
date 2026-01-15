public class UsingPlayerSelection {
    public static void main(String[] args) {

        PlayerSelection ps = new PlayerSelection();

        ps.addPoint();
        ps.addPoint();
        ps.addPoint();

        System.out.println(ps.hasWon());

    }
}