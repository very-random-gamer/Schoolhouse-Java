public class MultipleObjects {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();

        p1.addPoint();
        p1.addPoint();

        p2.addPoint();

        System.out.println(p1.score);
        System.out.println(p2.score);

    }
}
