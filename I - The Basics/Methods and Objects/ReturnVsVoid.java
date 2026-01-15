public class ReturnVsVoid {
    public static void main(String[] args) {

        printDouble(4);

        int value = doubleValue(4);
        System.out.println(value);

    }

    public static void printDouble(int x) {
        System.out.println(x * 2);
    }

    public static int doubleValue(int x) {
        return x * 2;
    }
}
