public class SimpleCounter { // objects store state and behavior

    private int count;

    public SimpleCounter() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
