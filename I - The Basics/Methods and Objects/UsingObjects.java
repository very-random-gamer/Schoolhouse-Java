public class UsingObjects {
    public static void main(String[] args) {

        SimpleCounter c = new SimpleCounter();

        c.increment();
        c.increment();

        int total = c.getCount();
        System.out.println(total);

    }
}
