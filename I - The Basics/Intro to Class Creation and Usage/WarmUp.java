public class WarmUp {
    public static void main(String[] args) {

        SimpleCounter c = new SimpleCounter();

        for (int i = 3; i < 6; i++) {
            if (i % 3 == 0) {
                c.increment();
            }
        }

        System.out.println(c.getCount());

    }
}
