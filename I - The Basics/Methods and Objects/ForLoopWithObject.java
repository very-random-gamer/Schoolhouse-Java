public class ForLoopWithObject {
    public static void main(String[] args) {

        SimpleCounter c = new SimpleCounter();

        for (int i = 0; i < 3; i++) {
            c.increment();
        }

        System.out.println(c.getCount());

    }
}
