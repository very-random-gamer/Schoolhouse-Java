public class PlayerLoop {
    public static void main(String[] args) {

        Player2 p = new Player2();

        for (int i = 0; i < 4; i++) {
            p.addPoint();
        }

        System.out.println(p.getScore());

    }
}

