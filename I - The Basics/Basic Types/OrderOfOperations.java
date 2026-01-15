public class OrderOfOperations {
    public static void main(String[] args) {

        // PEMDAS -> Parentheses - Exponents - Multiplication - Division or Modulo - Addition - Subtraction
        int result1 = 2 + 3 * 4;
        int result2 = (2 + 3) * 4;
        int result3 = (2 + 3) % 7 + 2; // % = /
        double result4 = (2.0 + 3) / 2 + 3;
        // 5 / 7 = 0

        System.out.println(result1); // 14
        System.out.println(result2); // 20
        System.out.println(result3); // 7
        System.out.println(result4); // 5.5

    }
}
