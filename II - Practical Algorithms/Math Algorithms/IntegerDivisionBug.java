public class IntegerDivisionBug {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println(a / b);          // 2
        System.out.println((double) a / b); // 2.5
    }
}
