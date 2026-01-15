public class StateVsReturn {
    public static void main(String[] args) {

        SimpleCounter c = new SimpleCounter();

        c.increment();
        c.increment();

        System.out.println(c.getCount());

    }
}
