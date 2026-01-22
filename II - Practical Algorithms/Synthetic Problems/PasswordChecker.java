public class PasswordChecker {

    public static boolean isStrong(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        // TODO: traverse string and update flags

        return hasUpper && hasLower && hasDigit && password.length() >= 8;
    }

    public static void main(String[] args) {
        System.out.println(isStrong("Hello123"));   // true
        System.out.println(isStrong("password"));   // false
        System.out.println(isStrong("ABC12345"));   // false
    }
}
