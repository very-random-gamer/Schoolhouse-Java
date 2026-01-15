public class RoundingDemo {
    public static void main(String[] args) {
        double value = 3.7;

        System.out.println(Math.round(value)); // 4
        System.out.println(Math.floor(value)); // 3.0
        System.out.println(Math.ceil(value));  // 4.0
        System.out.println((int) value);
    }
}
