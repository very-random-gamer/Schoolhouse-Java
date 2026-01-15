public class IntegerDivision {
    public static void main(String[] args) {

        int a = 7 / 2; // 7 / 2 = 3.5, but int, 3.5 will be truncated to 3
        double b = 7 / 2; // 7 / 2 = 3.5, but int, 3.5 will be truncated to 3
        double c = 7.0 / 2; // 7.0 / 2 = 3.5, 3.5 will not be truncated: 3.5

        System.out.println(a); // 3
        System.out.println(b); // 3.0
        System.out.println(c); // 3.5

    }
}
