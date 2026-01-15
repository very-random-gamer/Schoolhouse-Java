public class ExitTicket {
    public static void main(String[] args) {

        SimpleCounter c = new SimpleCounter();

        c.increment();
        c.increment();
        c.increment();

        int x = c.getCount();
        System.out.println(x);

    }
}
