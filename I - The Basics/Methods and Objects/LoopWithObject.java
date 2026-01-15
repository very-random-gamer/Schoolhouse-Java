public class LoopWithObject {
    public static void main(String[] args) {

        SimpleCounter c = new SimpleCounter();

        int i = 0;
        while (i < 4) {
            c.increment();
            i++;
        }

        System.out.println(c.getCount());

    }
}

